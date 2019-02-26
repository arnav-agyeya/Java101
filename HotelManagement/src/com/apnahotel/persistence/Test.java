package com.apnahotel.persistence;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.apnahotel.util.JDBCConnection;
import com.apnahotel.model.Booking;
import com.apnahotel.model.Customer;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BookingDao bd = new BookingDaoImplementation();
		//System.out.println("hello");
		  try {
			/*ArrayList<Booking>custBooking=new ArrayList<>();
			custBooking=bd.getCustomerBookings("1");
			System.out.println(custBooking);
			custBooking=bd.getAllBookings();
			System.out.println("======================");
			System.out.println(custBooking);*/
			/*System.out.println("modify paid amount");
			int amount=sc.nextInt();
			boolean isSuccessful=bd.updatePaidAmount(amount,1);
			if(isSuccessful)
				System.out.println("Paid amount modified successfully");
			else
				System.out.println("Paid amount not modified");*/
			
			
			/*Customer customer=new Customer("21","Harish",46,"Male",2345678901L,"harish@abc.com","hareRam");
			CustomerDao cd=new CustomerDaoImplentation();
			cd.insertCustomer(customer);
			System.out.println(cd.searchCustomer("21"));
			cd.updateCustomerEmail("21","Harish@xyz.com");
			System.out.println(cd.searchCustomer("21"));*/
			
			RoomDao rd = new RoomDaoImplementation();
			rd.getAvailableRooms(LocalDate.of(2018,07,17), LocalDate.of(2018,07,20), "xl");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
