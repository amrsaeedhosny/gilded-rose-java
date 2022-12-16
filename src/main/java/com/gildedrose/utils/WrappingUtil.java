package com.gildedrose.utils;

import com.gildedrose.Item;
import com.gildedrose.enums.ItemEnum;
import com.gildedrose.wrappers.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * A wrapping util that contains helper methods to wrap {@link Item} in an {@link ItemWrapper} class.
 */
public class WrappingUtil {

    private final Map<String, Class<? extends ItemWrapper>> wrapperClasses;

    public WrappingUtil() {
        wrapperClasses = new HashMap<>();
        wrapperClasses.put(ItemEnum.AGED_BRIE.getName(), AgedBrieItemWrapper.class);
        wrapperClasses.put(ItemEnum.BACKSTAGE_PASSES.getName(), BackstagePassItemWrapper.class);
        wrapperClasses.put(ItemEnum.SULFURAS.getName(), SulfurasItemWrapper.class);
        wrapperClasses.put(ItemEnum.CONJURED.getName(), ConjuredItemWrapper.class);
    }

    /**
     * Converts an array of {@link Item} to an array of {@link ItemWrapper}.
     *
     * @param items
     * @return itemWrappers
     */
    public ItemWrapper[] wrapItems(Item[] items) {
        ItemWrapper[] itemWrappers = new ItemWrapper[items.length];
        for (int i = 0; i < items.length; i++) {
            itemWrappers[i] = wrapItem(items[i]);
        }
        return itemWrappers;
    }

    /**
     * Converts an {@link Item} to an {@link ItemWrapper}.
     *
     * @param item
     * @return itemWrapper
     */
    public ItemWrapper wrapItem(Item item) {
        try {
            ItemWrapper itemWrapper = wrapperClasses.getOrDefault(item.name, NormalItemWrapper.class)
                    .getDeclaredConstructor(Item.class)
                    .newInstance(item);
            return itemWrapper;
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException |
                 IllegalAccessException e) {
            throw new RuntimeException("A runtime error occurred while mapping an item to item wrapper");
        }
    }
}
