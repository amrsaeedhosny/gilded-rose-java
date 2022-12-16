package com.gildedrose.wrappers;

import com.gildedrose.Item;
import com.gildedrose.strategies.QualityDecreaseStrategy;

/**
 * An item wrapper that holds a Conjured item that uses {@link QualityDecreaseStrategy} to update its quality.
 */
public class ConjuredItemWrapper extends ItemWrapper {

    private static final int REPEAT_TIMES = 2;

    public ConjuredItemWrapper(Item item) {
        super(item, new QualityDecreaseStrategy());
    }

    /**
     * Overrides the default {@link ItemWrapper#updateQuality()} method to add additional
     * functionality to the {@link QualityDecreaseStrategy}.
     */
    @Override
    public void updateQuality() {
        updateSellIn();
        for (int i = 0; i < REPEAT_TIMES; i++) {
            qualityUpdateStrategy.performUpdate(item);
        }
    }
}
