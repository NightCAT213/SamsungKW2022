package com.samsung.learning;

public class Product {
    private String name;
    private int count;
    private int cost;

    public static int productCount = 0;

    public Product(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;

        productCount++;
    }

    public String returnName() {
        return name;
    }

    public int returnCost() {
        return cost;
    }

    public int returnCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", cost=" + cost +
                '}';
    }

    public static void changeCount(Product product, int newCount) {
        product.count = newCount;
    }
}
