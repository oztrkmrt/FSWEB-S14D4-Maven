package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Bread("wheat", 5,"bread desc");
        products[1] = new Chocolate("dark", 4,"chocolate desc");
        products[2] = new Coke("diet", 3,"coke desc");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}