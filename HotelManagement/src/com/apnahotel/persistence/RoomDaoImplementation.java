package com.apnahotel.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.*;
import java.sql.Date;

import com.apnahotel.model.Booking;
import com.apnahotel.model.Room;
import com.apnahotel.util.JDBCConnection;

public class RoomDaoImplementation implements RoomDao {
    //not complete
	@Override
	public ArrayList<Room> getAvailableRooms(LocalDate checkIn, LocalDate checkOut, String roomType)
			throws ClassNotFoundException, SQLException {
		
		
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from ROOMS where rooms_type=? and rooms_id not in (select rooms_id from booking where (?>=check_in and ?<=check_out)or(?>=check_in and ?<=check_out)or(?<=check_in and ?>=check_out))");
		preparedStatement.setString(1, roomType);
		preparedStatement.setDate(2, Date.valueOf(checkIn));
		preparedStatement.setDate(3, Date.valueOf(checkIn));
		preparedStatement.setDate(4, Date.valueOf(checkOut));
		preparedStatement.setDate(5, Date.valueOf(checkOut));
		preparedStatement.setDate(6, Date.valueOf(checkIn));
		preparedStatement.setDate(7, Date.valueOf(checkOut));
		
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Room> result = new ArrayList<>();   //ArrayList to store previous booking too
		//System.out.println("Hello");
		while(resultSet.next()) {
			Room temp = new Room(resultSet.getString("rooms_id"),resultSet.getString("rooms_location"),
					resultSet.getString("rooms_type"),resultSet.getInt("rooms_status"),
					resultSet.getLong("rooms_price"));
			System.out.println(resultSet.getString("rooms_id"));
			//result.add(temp);
		}
		
		return result;
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
