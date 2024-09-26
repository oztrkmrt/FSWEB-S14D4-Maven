package org.example.model;

import javax.sound.midi.Soundbank;

public class Bread extends ProductForSale{

    private int weight;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread weight is " + weight);
    }
}
