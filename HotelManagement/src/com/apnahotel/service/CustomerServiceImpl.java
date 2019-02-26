package HotelManagement.src.com.service;

import java.sql.SQLException;

import HotelManagement.src.com.apnahotel.model.Customer;

import HotelManagement.src.com.apnahotel.persistence.CustomerDao;
import HotelManagement.src.com.apnahotel.persistence.CustomerDaoImplentation;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao=new CustomerDaoImplentation();
	public boolean validate(String CustomerId,String password) throws ClassNotFoundException, SQLException {
		Customer customer=customerDao.searchCustomer(CustomerId);
		if(customer==null)
			return false;
		if(password.equals(customer.getCustPassword()))
			return true;
		return false;
	}
	

}
