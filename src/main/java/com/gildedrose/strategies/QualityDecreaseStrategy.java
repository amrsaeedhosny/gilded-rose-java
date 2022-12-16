package com.gildedrose.strategies;

import com.gildedrose.Item;

/**
 * A quality decrease strategy that is being used by Conjured and normal item types.
 */
public class QualityDecreaseStrategy implements QualityUpdateStrategy {

    private static final int QUALITY_DECREASE_AMOUNT = 1;
    private static final int QUALITY_MIN_VALUE = 0;

    /**
     * Decreases the quality of a given item by some decrease amount.
     *
     * @param item
     */
    @Override
    public void performUpdate(Item item) {
        if (item.quality > QUALITY_MIN_VALUE) {
            int decreaseAmount = item.sellIn >= 0 ? QUALITY_DECREASE_AMOUNT : 2 * QUALITY_DECREASE_AMOUNT;
            item.quality = Math.max(item.quality - decreaseAmount, QUALITY_MIN_VALUE);
        }
    }
}
