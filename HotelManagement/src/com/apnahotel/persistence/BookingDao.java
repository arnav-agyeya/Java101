package com.apnahotel.persistence;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.*;

import com.apnahotel.model.Booking;
//Arnav Herer
public interface BookingDao {
	boolean insertBooking(Booking booking) throws ClassNotFoundException,SQLException;
	ArrayList<Booking> getAllBookings() throws ClassNotFoundException,SQLException;
	ArrayList<Booking> getCustomerBookings(String customerId) throws ClassNotFoundException,SQLException;
	boolean updateCheckOutDate(int bookingId,LocalDate checkOutDate)throws ClassNotFoundException,SQLException;
	boolean updateTotalAmount(int bookingId,int totalAmount)throws ClassNotFoundException,SQLException;
	boolean updatePaidAmount(int paidAmount,int bookingId)throws ClassNotFoundException,SQLException;
	
}

//parameters changed