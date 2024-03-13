package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private long id;
    private String name;
    private String category;
    private double price;
    private String customer;


    public Product(long id, String name, String category, double price,String customer) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.customer=customer;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price * 0.9;

    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}


