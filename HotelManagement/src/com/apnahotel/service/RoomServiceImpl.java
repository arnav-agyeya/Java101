package HotelManagement.src.com.service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import HotelManagement.src.com.apnahotel.persistence.RoomDao;
import HotelManagement.src.com.apnahotel.persistence.RoomDaoImplementation;
public class RoomServiceImpl implements RoomService {
	
    private RoomDao roomDao=new RoomDaoImplementation();
	public ArrayList<Room> searchRooms(String checkIn, String checkout,
			String roomType) throws DateTimeParseException{
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDateCheckIn= LocalDate.parse(checkIn, dateTimeFormatter); 
		LocalDate localDateCheckOut= LocalDate.parse(checkout, dateTimeFormatter);
		return roomDao.getAvailableRooms(localDateCheckIn, localDateCheckOut, roomType)
		return null;
	}

}
