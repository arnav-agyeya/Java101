package com.apnahotel.persistence;

import java.sql.SQLException;
import java.time.LocalDate;
import com.apnahotel.util.JDBCConnection;
import com.apnahotel.model.Booking;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookingDao bd = new BookingDaoImplementation();
		  try {
			bd.getCustomerBookings("1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
