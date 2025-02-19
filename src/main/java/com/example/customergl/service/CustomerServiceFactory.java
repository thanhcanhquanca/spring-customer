package com.example.customergl.service;

public class CustomerServiceFactory {
   private static CustomerService instance = new CustomerService();

   public static CustomerService getInstance() {
       return instance;
   }
}
