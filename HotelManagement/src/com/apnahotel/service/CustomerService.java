package HotelManagement.src.com.service;

import java.sql.SQLException;

public interface CustomerService {
    public boolean validate(String CustomerId,String password) throws ClassNotFoundException, SQLException;
	
}
