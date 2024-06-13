package com.javatechie;

import com.javatechie.dto.Customer;
import com.javatechie.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class LambdaPocApplication {

	@Autowired
	private CustomerService service;

	public static void main(String[] args) {
		SpringApplication.run(LambdaPocApplication.class, args);
	}

//	@Bean
//	public Supplier<List<Customer>> customers() {
//		return () -> service.getAllCustomers();
//	}
//
//	@Bean
//	public Function<Customer,Customer> addCustomers() {
//		return (customer) -> service.addCustomerDetails(customer);
//	}

	@Bean
	public Function<String, String> uppercase() {
		return String::toUpperCase;
	}

}
