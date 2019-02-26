package HotelManagement.src.com.service;

import java.sql.SQLException;

import HotelManagement.src.com.apnahotel.model.Customer;

import HotelManagement.src.com.apnahotel.persistence.CustomerDao;
import HotelManagement.src.com.apnahotel.persistence.CustomerDaoImplentation;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao=new CustomerDaoImplentation();
	public boolean validate(String CustomerId) throws ClassNotFoundException, SQLException {
		Customer customer=customerDao.searchCustomer(CustomerId);
		if(customer==null)
			return false;
		if(CustomerId.equals(customer.getCustPassword()))
			return true;
		return false;
	}
	

}
