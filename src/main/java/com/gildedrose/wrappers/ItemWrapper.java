package com.gildedrose.wrappers;

import com.gildedrose.Item;
import com.gildedrose.strategies.QualityUpdateStrategy;

/**
 * An item wrapper class that wraps an {@link Item} and provides it with {@link QualityUpdateStrategy}
 * functionality based on the composition over inheritance principle.
 */
public abstract class ItemWrapper {

    protected Item item;
    protected QualityUpdateStrategy qualityUpdateStrategy;

    protected ItemWrapper(Item item, QualityUpdateStrategy qualityUpdateStrategy) {
        this.item = item;
        this.qualityUpdateStrategy = qualityUpdateStrategy;
    }

    /**
     * Decreases the sellIn of the wrapped {@link Item}.
     */
    protected void updateSellIn() {
        item.sellIn--;
    }

    /**
     * Updates the quality values based on the provided {@link QualityUpdateStrategy}. If the strategy provided
     * holds a null value, calling the method won't have an impact on the quality.
     */
    public void updateQuality() {
        if (qualityUpdateStrategy != null) {
            updateSellIn();
            qualityUpdateStrategy.performUpdate(item);
        }
    }
}
