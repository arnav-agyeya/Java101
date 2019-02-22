package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.apnahotel.model.Room;

public interface RoomDao {
	
	ArrayList<Room> getAvailableRooms(Date checkIn, Date checkOut, String roomType)throws ClassNotFoundException,SQLException;
	boolean updateRoomPrice(String roomId)throws ClassNotFoundException,SQLException;
}
