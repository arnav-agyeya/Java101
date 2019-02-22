package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.apnahotel.model.Customer;


public interface CustomerDao {
	boolean insertCustomer(Customer customer) throws ClassNotFoundException,SQLException;
	Customer searchCustomer(String customerId) throws ClassNotFoundException,SQLException;
	ArrayList<Customer> getAllCustomer()throws ClassNotFoundException,SQLException;
	boolean updateCustomerPassword(String customerId,String customerPassword)throws ClassNotFoundException,SQLException;
	boolean updateCustomerEmail(String customerId,String customerEmail)throws ClassNotFoundException,SQLException;
}
