package com.gildedrose.item;

import com.gildedrose.Item;

public class Conjured extends Item {
    public Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (quality > 0) {
            quality = quality - 2;
        }
    }
}
