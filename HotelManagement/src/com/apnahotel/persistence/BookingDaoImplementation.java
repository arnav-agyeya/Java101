package com.apnahotel.persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.apnahotel.model.Booking;
import com.apnahotel.util.JDBCConnection;

public class BookingDaoImplementation implements BookingDao {
	//done
	@Override
	public boolean insertBooking(Booking booking) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO BOOKING VALUES(?,?,?,?,?,?,?)");
		preparedStatement.setLong(1, booking.getBookingId());
		preparedStatement.setString(2, booking.getRoomId());
		preparedStatement.setString(3, booking.getCustId());
		
		Date date=Date.valueOf(booking.getCheckInDate());
		
		preparedStatement.setDate(4, date);
		date=Date.valueOf(booking.getCheckOutDate());
		preparedStatement.setDate(5, date);
		preparedStatement.setLong(6, booking.getBillAmount());
		preparedStatement.setLong(7, booking.getPaidAmount());
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	
	}

	@Override
	public ArrayList<Booking> getAllBookings() throws ClassNotFoundException, SQLException {
		Connection connection=JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM BOOKING");
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Booking>result=new ArrayList<>();
		while(resultSet.next())
		{
			Booking temp=new Booking();
			temp.setBookingId(resultSet.getLong("booking_id"));
			temp.setRoomId(resultSet.getString("rooms_id"));
			temp.setCustId(resultSet.getString("customer_id"));
			temp.setCheckInDate(resultSet.getDate("check_in").toLocalDate());
			temp.setCheckOutDate(resultSet.getDate("check_out").toLocalDate());
			temp.setBillAmount(resultSet.getLong("bill_amount"));
			temp.setPaidAmount(resultSet.getLong("paid_amount"));
			result.add(temp);
		}
		connection.close();
		return result;
	}

	@Override
	public ArrayList<Booking> getCustomerBookings(String customerId) throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM BOOKING WHERE CUSTOMER_ID = ?");
		preparedStatement.setString(1, customerId);
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Booking> result = new ArrayList<>();   //ArrayList to store previous booking too
		
		while(resultSet.next()) {
			Booking temp = new Booking(resultSet.getLong("booking_id"),resultSet.getString("rooms_id"),
					resultSet.getString("customer_id"),resultSet.getDate("check_in").toLocalDate(),
					resultSet.getDate("check_out").toLocalDate(),resultSet.getLong("bill_amount"),
					resultSet.getLong("paid_amount"));
			result.add(temp);
		}
		connection.close();
		return result;
	}

	@Override
	public boolean updateCheckOutDate(int bookingId, LocalDate checkOutDate)
			throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE BOOKING SET check_out="+Date.valueOf(checkOutDate)+"WHERE booking_id="+bookingId);
		//preparedStatement.setString(1, booking.getBookingId());
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

	

	@Override
	public boolean updatePaidAmount(int paidAmount,int bookingId) throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE BOOKING SET paid_amount="+paidAmount +"WHERE booking_id="+bookingId);
		//preparedStatement.setString(1, booking.getBookingId());
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

	@Override
	public boolean updateTotalAmount(int bookingId, int totalAmount) throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE BOOKING SET paid_amount="+totalAmount +"WHERE booking_id="+bookingId);
		//preparedStatement.setString(1, booking.getBookingId());
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

}
