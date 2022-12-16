package com.gildedrose.strategies;

import com.gildedrose.Item;

/**
 * A quality increase strategy that is being used by Aged Brie and Backstage Pass item types.
 */
public class QualityIncreaseStrategy implements QualityUpdateStrategy {

    private static final int QUALITY_INCREASE_AMOUNT = 1;
    private static final int QUALITY_MAX_VALUE = 50;

    /**
     * Increases the quality of a given item by some increase amount.
     *
     * @param item
     */
    @Override
    public void performUpdate(Item item) {
        if (item.quality < QUALITY_MAX_VALUE) {
            int increaseAmount = item.sellIn >= 0 ? QUALITY_INCREASE_AMOUNT : 2 * QUALITY_INCREASE_AMOUNT;
            item.quality = Math.min(item.quality + increaseAmount, QUALITY_MAX_VALUE);
        }
    }
}
