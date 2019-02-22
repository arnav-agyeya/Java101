package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.apnahotel.model.Customer;

public class CustomerDaoImplentation implements CustomerDao {

	@Override
	public boolean insertCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer searchCustomer(String customerId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Customer> getAllCustomer() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomerPassword(String customerId, String customerPassword)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCustomerEmail(String customerId, String customerEmail)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
