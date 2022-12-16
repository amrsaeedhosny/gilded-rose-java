package com.gildedrose.wrappers;

import com.gildedrose.Item;

/**
 * An item wrapper that holds a Sulfures item with no update strategy.
 */
public class SulfurasItemWrapper extends ItemWrapper {

    public SulfurasItemWrapper(Item item) {
        super(item, null);
    }
}
