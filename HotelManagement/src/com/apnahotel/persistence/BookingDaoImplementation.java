package com.apnahotel.persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.apnahotel.model.Booking;
import com.apnahotel.util.JDBCConnection;

public class BookingDaoImplementation implements BookingDao {
	// this is from avinash
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Booking> getCustomerBookings(String customerId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCheckOutDate(String bookingId, LocalDate checkOutDate)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTotalAmount(String bookingId, int totalAmount) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePaidAmount(String bookingId, int paidAmount) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
