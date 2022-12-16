package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    @DisplayName("Test normal item with available sellIn days")
    void testNormalItemWithAvailableSellInDays() {
        int sellIn = 1, quality = 10;

        Item item = new Item("Normal", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality - 1, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test normal item with no sellIn days")
    void testNormalItemWithNoSellInDays() {
        int sellIn = 0, quality = 10;

        Item item = new Item("Normal", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality - 2, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test normal item with min quality of zero")
    void testNormalItemWithMinQuality() {
        int sellIn = 1, quality = 0;

        Item item = new Item("Normal", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Aged Brie item with available sellIn days")
    void testAgedBrieItemWithAvailableSellInDays() {
        int sellIn = 1, quality = 10;

        Item item = new Item("Aged Brie", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality + 1, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Aged Brie item with no sellIn days")
    void testAgedBrieItemWithNoSellInDays() {
        int sellIn = 0, quality = 10;

        Item item = new Item("Aged Brie", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality + 2, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Aged Brie item with max quality of 50 ")
    void testAgedBrieItemWithMaxQuality() {
        int sellIn = 1, quality = 50;

        Item item = new Item("Aged Brie", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Sulfuras item")
    void testSulfurasItem() {
        int sellIn = 1, quality = 80;

        Item item = new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality, item.quality);
        assertEquals(sellIn, item.sellIn);
    }

    @Test
    @DisplayName("Test Backstage Passes with more than ten sellIn days")
    void testBackstagePassesWithMoreThanTenSellInDays() {
        int sellIn = 11, quality = 10;

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality + 1, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Backstage Passes with ten sellIn days or less")
    void testBackstagePassesWithTenSellInDaysOrLess() {
        int sellIn = 10, quality = 10;

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality + 2, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Backstage Passes with five sellIn days or less")
    void testBackstagePassesWithFiveSellInDaysOrLess() {
        int sellIn = 5, quality = 10;

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality + 3, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Backstage Passes with no sellIn days")
    void testBackstagePassesWithNoSellInDays() {
        int sellIn = 0, quality = 10;

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Backstage Passes with max quality of 50")
    void testBackstagePassesWithMaxQuality() {
        int sellIn = 5, quality = 50;

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Conjured item with available sellIn days")
    void testConjuredItemWithAvailableSellInDays() {
        int sellIn = 1, quality = 10;

        Item item = new Item("Conjured Mana Cake", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality - 2, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Conjured item with no sellIn days")
    void testConjuredItemWithNoSellInDays() {
        int sellIn = 0, quality = 10;

        Item item = new Item("Conjured Mana Cake", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality - 4, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }

    @Test
    @DisplayName("Test Conjured item with min quality of zero")
    void testConjuredItemWithMinQuality() {
        int sellIn = 1, quality = 0;

        Item item = new Item("Conjured Mana Cake", sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();

        assertEquals(quality, item.quality);
        assertEquals(sellIn - 1, item.sellIn);
    }
}
