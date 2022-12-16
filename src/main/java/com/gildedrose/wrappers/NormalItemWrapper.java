package com.gildedrose.wrappers;

import com.gildedrose.Item;
import com.gildedrose.strategies.QualityDecreaseStrategy;

/**
 * An item wrapper that holds a normal item that uses {@link QualityDecreaseStrategy} to update its quality.
 */
public class NormalItemWrapper extends ItemWrapper {

    public NormalItemWrapper(Item item) {
        super(item, new QualityDecreaseStrategy());
    }
}
