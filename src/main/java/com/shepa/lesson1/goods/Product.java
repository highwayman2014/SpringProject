package com.shepa.lesson1.goods;

public class Product {
    private int id;
    private String name;
    private float cost;

    public Product(int id, String name, float cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("ID: %d; Name: %s; Cost: %f", id, name, cost);
    }
}
