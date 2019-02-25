package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.apnahotel.model.Booking;
import com.apnahotel.model.Customer;
import com.apnahotel.util.JDBCConnection;

public class CustomerDaoImplentation implements CustomerDao {

	@Override
	public boolean insertCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		Connection connection=JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("Insert into CUSTOMERS values(?,?,?,?,?,?,?)");
		preparedStatement.setString(1, customer.getCustId());
		preparedStatement.setString(2, customer.getCustName());
		preparedStatement.setInt(3, customer.getCustAge());
		preparedStatement.setString(4, customer.getCustSex());
		preparedStatement.setLong(5, customer.getCustMob());
		preparedStatement.setString(6, customer.getCustEmail());
		preparedStatement.setString(7, customer.getCustPassword());
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

	@Override
	public Customer searchCustomer(String customerId) throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID = ?");
		preparedStatement.setString(1, customerId);
		ResultSet resultSet=preparedStatement.executeQuery();
		Customer temp=new Customer();
		while(resultSet.next()) {
			temp.setCustId(resultSet.getString("customer_id"));
			temp.setCustName(resultSet.getString("customer_name"));
			temp.setCustAge(resultSet.getInt("customer_age"));
			temp.setCustSex(resultSet.getString("customer_sex"));
			temp.setCustMob(resultSet.getLong("customer_number"));
			temp.setCustEmail(resultSet.getString("customer_emailid"));
			temp.setCustPassword(resultSet.getString("customer_password"));
		}
		connection.close();
		return temp;
	}

	@Override
	public ArrayList<Customer> getAllCustomer() throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM CUSTOMERS");
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Customer> result=new ArrayList<>();
		while(resultSet.next()) {
			Customer temp=new Customer();
			temp.setCustId(resultSet.getString("customer_id"));
			temp.setCustName(resultSet.getString("customer_name"));
			temp.setCustAge(resultSet.getInt("customer_age"));
			temp.setCustSex(resultSet.getString("customer_sex"));
			temp.setCustMob(resultSet.getLong("customer_number"));
			temp.setCustEmail(resultSet.getString("customer_emailid"));
			temp.setCustPassword(resultSet.getString("customer_password"));
			result.add(temp);
		}
		connection.close();
		return result;
	}

	@Override
	public boolean updateCustomerPassword(String customerId, String customerPassword)
			throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE CUSTOMERS SET customer_password=? WHERE customer_id=?");
		preparedStatement.setString(1, customerPassword);
		preparedStatement.setString(2, customerId);
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

	@Override
	public boolean updateCustomerEmail(String customerId, String customerEmail)
			throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE CUSTOMERS SET customer_emailid=? WHERE customer_id=?");
		preparedStatement.setString(1, customerEmail);
		preparedStatement.setString(2, customerId);
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

}
