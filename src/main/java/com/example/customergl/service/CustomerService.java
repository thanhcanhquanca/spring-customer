package com.example.customergl.service;

import com.example.customergl.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<>();
        customers.add(new Customer(1L, "Nguyễn Văn A", "nguyenvana@example.com", "0123456789"));
        customers.add(new Customer(2L, "Trần Thị B", "tranb@example.com", "0987654321"));
        customers.add(new Customer(3L, "Lê Văn C", "levanc@example.com", "0345678901"));
    }
    public List<Customer> findAll() {
        return customers;
    }
}
