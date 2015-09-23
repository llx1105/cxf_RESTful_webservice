package services;

import models.Customer;
import models.CustomerRepository;
import models.Customers;

/**
 * Created by lxliang on 9/21/15.
 */
public class CustomerImp implements CustomerInterface {

    public Customer getCustomer(String id) {
        return CustomerRepository.getInstance().getCustomer(id);
    }

    public Customers getCustomers() {
        return new Customers(CustomerRepository.getInstance().getCustomers());
    }

    public Customer createCustomer(Customer customer) {
        return CustomerRepository.getInstance().createCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
        CustomerRepository.getInstance().updateCustomer(customer);
    }

    public void removeCustomer(String id) {
        CustomerRepository.getInstance().removeCustomer(id);
    }
}
