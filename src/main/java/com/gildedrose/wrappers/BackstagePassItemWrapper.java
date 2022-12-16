package com.gildedrose.wrappers;

import com.gildedrose.Item;
import com.gildedrose.strategies.QualityIncreaseStrategy;

/**
 * An item wrapper that holds a Backstage Pass item that uses {@link QualityIncreaseStrategy} to update its quality.
 */
public class BackstagePassItemWrapper extends ItemWrapper {

    private static final int[] INCREMENT_DAYS = {10, 5};

    public BackstagePassItemWrapper(Item item) {
        super(item, new QualityIncreaseStrategy());
    }

    /**
     * Overrides the default {@link ItemWrapper#updateQuality()} method to add additional
     * functionality to the {@link QualityIncreaseStrategy}.
     */
    @Override
    public void updateQuality() {
        updateSellIn();
        if (item.sellIn > 0) {
            qualityUpdateStrategy.performUpdate(item);
            for (int day : INCREMENT_DAYS) {
                if (item.sellIn < day) {
                    qualityUpdateStrategy.performUpdate(item);
                }
            }
        } else {
            item.quality = 0;
        }
    }
}
