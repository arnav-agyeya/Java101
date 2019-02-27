package HotelManagement.src.com.service;

import java.time.format.DateTimeParseException;

public interface RoomService {
	ArrayList<Room> searchRooms(String checkIn,String checkout,String roomType)throws DateTimeParseException;
}
