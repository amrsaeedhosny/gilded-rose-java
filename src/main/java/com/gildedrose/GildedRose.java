package com.gildedrose;

import com.gildedrose.utils.WrappingUtil;
import com.gildedrose.wrappers.ItemWrapper;

/**
 * An application that updates the quality of provided items using different strategies with
 * some restrictions.
 */
class GildedRose {
    private static final WrappingUtil wrappingUtil1 = new WrappingUtil();
    private final ItemWrapper[] itemWrappers;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
        this.itemWrappers = wrappingUtil1.wrapItems(items);
    }

    public void updateQuality() {
        for (ItemWrapper itemWrapper : itemWrappers) {
            itemWrapper.updateQuality();
        }
    }
}