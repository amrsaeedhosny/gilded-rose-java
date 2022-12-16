package com.gildedrose.wrappers;

import com.gildedrose.Item;
import com.gildedrose.strategies.QualityIncreaseStrategy;

/**
 * An item wrapper that holds an Aged Brie item that uses {@link QualityIncreaseStrategy} to update its quality.
 */
public class AgedBrieItemWrapper extends ItemWrapper {

    public AgedBrieItemWrapper(Item item) {
        super(item, new QualityIncreaseStrategy());
    }
}
