package src.skrypnyk.hw15;

import java.io.Serializable;
public class Products implements Serializable {

    private String name;
    private int count;
    private double price;
    public Products(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                name +
                ", count= " + count +
                ", price= " + price;
    }

    public String name() {
        return name;
    }

    public int count() {
        return count;
    }

    public double price() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }
}