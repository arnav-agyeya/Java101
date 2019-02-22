package com.apnahotel.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.apnahotel.model.Room;

public class RoomDaoImplementation implements RoomDao {

	@Override
	public ArrayList<Room> getAvailableRooms(Date checkIn, Date checkOut, String roomType)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRoomPrice(String roomId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
