package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.time.*;

import com.apnahotel.model.Room;

public class RoomDaoImplementation implements RoomDao {

	@Override
	public ArrayList<Room> getAvailableRooms(LocalDate checkIn, LocalDate checkOut, String roomType)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRoomPrice(String roomId, int price) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
