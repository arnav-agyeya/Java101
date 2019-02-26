package HotelManagement.src.com.service;

import HotelManagement.src.com.apnahotel.persistence.BookingDao;
import HotelManagement.src.com.apnahotel.persistence.BookingDaoImplementation;

public class BookingServiceImpl implements BookingService {
	
	BookingDao bookingDao=new BookingDaoImplementation();
	public ArrayList<Booking> searchBookings(String CustomerId) {
		return bookingDao.getCustomerBookings(CustomerId);
	}
	

}
