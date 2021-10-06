package com.sabi.assessment.service;

import java.util.List;

import com.sabi.assessment.model.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

	void addOrUpdateCustomer(Customer customer);

	void updateCustomer(Customer customer);

	Customer getCustomerByPk(Long customerId);

	List<Customer> getAllCustomer();

	void deleteCustomer(Long customerId);	
	
}
