package models;

import java.util.List;

public class Customers {
    private List<Customer> customer;

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> data) {
        this.customer = data;
    }

    public Customers() {
        super();
    }

    public Customers(List<Customer> customer) {
        super();
        this.customer = customer;
    }
}
