package com.shepa.lesson3.content;

public class Product {
    private int id;
    private String title;
    private double cost;
    static private int counter = 0;

    public Product() {
        this.id = counter++;
    }

    public Product(String title, double cost) {
        this.id = counter++;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
