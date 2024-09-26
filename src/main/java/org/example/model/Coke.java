package org.example.model;

public class Coke extends ProductForSale{

    private boolean isLight;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("is the coke light? " + isLight);
    }
}
