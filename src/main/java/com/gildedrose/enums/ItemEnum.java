package com.gildedrose.enums;

/**
 * An enum holding the full name of the different items.
 */
public enum ItemEnum {

    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS("Sulfuras, Hand of Ragnaros"),
    CONJURED("Conjured Mana Cake");


    private String name;

    ItemEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
