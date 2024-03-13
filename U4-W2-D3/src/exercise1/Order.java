package exercise1;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate,deliveryDate;

    private List<Product> products;
    private Customer customer;


    public Order(long id,String status, LocalDate orderDate, LocalDate deliveryDate,List<Product> products, Customer customer){
        this.orderDate= orderDate;
        this.products=products;
        this.customer=customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
