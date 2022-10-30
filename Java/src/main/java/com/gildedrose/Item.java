package com.gildedrose;

public class Item {
    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    void passOneDay() {
        decreaseSellIn();
        updateQuality();
        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        decreaseQuality();
    }

    protected void updateQualityAfterExpiration() {
        decreaseQuality();
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
