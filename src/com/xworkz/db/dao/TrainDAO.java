package com.xworkz.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.db.dto.TrainDTO;
import com.xworkz.db.utils.DBUtil;

public class TrainDAO {

	Connection mysql = null;

	public boolean save(TrainDTO dtos) {

		mysql = DBUtil.createConnection();
		System.out.println("invoked method save");
		try {

			String sql = "insert into train values(?,?,?,?,?,?,?,?)";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, dtos.getTrain_id());
			stat.setObject(2, dtos.getTrain_no());
			stat.setObject(3, dtos.getBoarding());
			stat.setObject(4, dtos.getDestination());
			stat.setObject(5, dtos.getTrain_seat_No());
			stat.setObject(6, dtos.getPrice());
			stat.setObject(7, dtos.getTrain_class());
			stat.setObject(8, dtos.getName());
			int rowsAffected = stat.executeUpdate();
			System.out.println(sql);
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(mysql);
		}

		return false;
	}

	public boolean deleteByTrainNO(int id) {
		mysql = DBUtil.createConnection();
		System.out.println("delete method invoked here");
		try {

			String sql = "delete from train where train_id=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, id);
			int rowsAffected = stat.executeUpdate();
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return false;

	}

	public boolean deleteByTrainNoAndTrainId(int TrainNo, int tid) {
		mysql = DBUtil.createConnection();
		System.out.println("deleteByTrainNoAndTrainId this method invoked here");
		try {

			String sql = "delete from train where train_No=? and train_Id=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, TrainNo);
			stat.setObject(2, tid);
			int rowsAffected = stat.executeUpdate();
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return false;
	}

	public TrainDTO getByTrainNo(int trainNo) {
		System.out.println("getByTrainNo this method invoked here");
		mysql = DBUtil.createConnection();
		TrainDTO dtos = null;
		try {

			String sql = "select * from train where train_no=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, trainNo);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				int train_id = result.getInt(1);
				System.out.println("trainid- " + train_id);
				String train_no = result.getString(2);
				System.out.println("trainNo - " + train_no);
				String boarding = result.getString(3);
				System.out.println("Boarding - " + boarding);
				String destination = result.getString(4);
				System.out.println("Destination -" + destination);
				int seat_No = result.getInt(5);
				System.out.println("TrainSeatNo- " + seat_No);
				double ticketPrice = result.getInt(6);
				System.out.println("TrainPrice - " + ticketPrice);
				String classs = result.getString(7);
				System.out.println("CoachClass - " + classs);
				String name = result.getString(8);
				System.out.println("name -" + name);
				dtos = new TrainDTO(train_id, train_id, boarding, destination, seat_No, seat_No, train_no, name);
				return dtos;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return null;
	}

	public Collection<TrainDTO> getAll() {

		mysql = DBUtil.createConnection();
		Collection<TrainDTO> details = new ArrayList<TrainDTO>();
		TrainDTO dtos = new TrainDTO(0, 0, null, null, 0, 0, null, null);
		try {

			String sql = "select * from train";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {

				int Train_id = result.getInt(1);
				int Train_no = result.getInt(2);
				String Boarding = result.getString(3);
				String Destination = result.getString(4);
				int Train_seat_No = result.getInt(5);
				int price = result.getInt(6);
				String coach_class = result.getString(7);
				String name = result.getString(8);

				dtos.setTrain_id(Train_id);
				dtos.setTrain_no(Train_no);
				dtos.setBoarding(Boarding);
				dtos.setDestination(Destination);
				dtos.setTrain_seat_No(Train_seat_No);
				dtos.setPrice(price);
				dtos.setTrain_class(coach_class);
				dtos.setName(name);

				details.add(dtos);

				System.out.println("train_id: " + Train_id + " " + "train_no: " + Train_no + " " + "boarding: "
						+ Boarding + " " + "destinaation: " + Destination + "  " + "train_seat_No: " + Train_seat_No
						+ "  " + "price: " + price + "  " + "train_class: " + coach_class + "  " + "name: "
						+ name);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return details;
	}

	public boolean updateDestinationByTrainNo(String newDest, String trainNo) {
		mysql = DBUtil.createConnection();
		try {

			String sql = "Update train " + "set destination=?" + "where train_no=? ";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, newDest);
			stat.setObject(2, trainNo);
			int rowsAffected = stat.executeUpdate();
			if (rowsAffected == 1) {
				System.out.println("updated: " + rowsAffected);
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return false;
	}

	public int getMaxPrice() {
		mysql = DBUtil.createConnection();
		int maxPrice = 0;

		try {

			String sql = "select max(price) from train";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				maxPrice = result.getInt(1);
				System.out.println("MaxPrice= " + maxPrice);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return maxPrice;
	}

	public int getMinPrice() {
		mysql = DBUtil.createConnection();
		int minPrice = 0;

		try {

			String sql = "select min(price) from train";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				minPrice = result.getInt(1);
				System.out.println("MinPrice= " + minPrice);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return minPrice;
	}

}
