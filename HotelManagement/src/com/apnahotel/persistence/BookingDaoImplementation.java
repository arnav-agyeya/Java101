package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.apnahotel.model.Booking;

public class BookingDaoImplementation implements BookingDao {

	@Override
	public boolean insertBooking(Booking booking) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
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
	public boolean updateCheckOutDate(String bookingId, Date checkOutDate) throws ClassNotFoundException, SQLException {
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
