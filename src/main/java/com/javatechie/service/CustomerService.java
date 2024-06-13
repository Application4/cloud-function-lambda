package com.javatechie.service;

import com.javatechie.dto.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    List<Customer> customerList = null;

    @PostConstruct
    public List<Customer> mockCustomerList() {
        customerList = new ArrayList<>();
        customerList.add(new Customer("c1", "John", "Doe", "john.doe@example.com", "123-456-7890", "123 Main St, Springfield, USA"));
        customerList.add(new Customer("c2", "Jane", "Smith", "jane.smith@example.com", "234-567-8901", "456 Elm St, Springfield, USA"));
        customerList.add(new Customer("c3", "Michael", "Johnson", "michael.johnson@example.com", "345-678-9012", "789 Oak St, Springfield, USA"));
        customerList.add(new Customer("c4", "Emily", "Davis", "emily.davis@example.com", "456-789-0123", "101 Pine St, Metropolis, USA"));
        customerList.add(new Customer("c5", "Chris", "Brown", "chris.brown@example.com", "567-890-1234", "202 Maple St, Metropolis, USA"));
        customerList.add(new Customer("c6", "Sarah", "Wilson", "sarah.wilson@example.com", "678-901-2345", "303 Birch St, Gotham, USA"));
        customerList.add(new Customer("c7", "David", "Martinez", "david.martinez@example.com", "789-012-3456", "404 Cedar St, Gotham, USA"));
        customerList.add(new Customer("c8", "Laura", "Garcia", "laura.garcia@example.com", "890-123-4567", "505 Spruce St, Star City, USA"));
        customerList.add(new Customer("c9", "James", "Miller", "james.miller@example.com", "901-234-5678", "606 Walnut St, Star City, USA"));
        customerList.add(new Customer("c10", "Sophia", "Anderson", "sophia.anderson@example.com", "012-345-6789", "707 Cherry St, Central City, USA"));
        return customerList;
    }

    public Customer addCustomerDetails(Customer customer) {
        customerList.add(customer);
        return customer;
    }

    public List<Customer> getAllCustomers() {
        return customerList;
    }
}
