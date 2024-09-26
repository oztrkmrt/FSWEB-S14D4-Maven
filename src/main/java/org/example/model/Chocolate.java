package org.example.model;

public class Chocolate extends ProductForSale{

    private double cocoaPercentage;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Cocoa percentage is " + cocoaPercentage);
    }
}
