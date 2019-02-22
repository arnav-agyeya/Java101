package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.time.*;

import com.apnahotel.model.Room;



public interface RoomDao {
	
	ArrayList<Room> getAvailableRooms(LocalDate checkIn, LocalDate checkOut, String roomType)throws ClassNotFoundException,SQLException;
	boolean updateRoomPrice(String roomId, int price)throws ClassNotFoundException,SQLException;
}
