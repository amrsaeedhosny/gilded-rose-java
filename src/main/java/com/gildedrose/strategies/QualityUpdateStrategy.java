package com.gildedrose.strategies;

import com.gildedrose.Item;

/**
 * A quality update interface that allows implementing different quality update behaviors.
 */
public interface QualityUpdateStrategy {

    /**
     * Given an item it performs a quality updated based on the implementation strategy.
     *
     * @param item
     */
    void performUpdate(Item item);
}
