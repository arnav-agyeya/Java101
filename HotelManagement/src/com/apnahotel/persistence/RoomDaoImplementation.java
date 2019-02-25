package com.apnahotel.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.*;

import com.apnahotel.model.Room;
import com.apnahotel.util.JDBCConnection;

public class RoomDaoImplementation implements RoomDao {

	@Override
	public ArrayList<Room> getAvailableRooms(LocalDate checkIn, LocalDate checkOut, String roomType)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRoomPrice(String roomId, int price) throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE ROOMS SET rooms_price=? WHERE rooms_id=?");
		preparedStatement.setInt(1, price);
		preparedStatement.setString(2, roomId);
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

}
