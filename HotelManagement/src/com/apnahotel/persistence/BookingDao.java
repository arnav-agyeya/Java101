package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.apnahotel.model.Booking;

public interface BookingDao {
	boolean insertBooking(Booking booking) throws ClassNotFoundException,SQLException;
	ArrayList<Booking> getAllBookings() throws ClassNotFoundException,SQLException;
	ArrayList<Booking> getCustomerBookings(String customerId) throws ClassNotFoundException,SQLException;
	boolean updateCheckOutDate(String bookingId,Date checkOutDate)throws ClassNotFoundException,SQLException;
	boolean updateTotalAmount(String bookingId,int totalAmount)throws ClassNotFoundException,SQLException;
	boolean updatePaidAmount(String bookingId,int paidAmount)throws ClassNotFoundException,SQLException;
}
