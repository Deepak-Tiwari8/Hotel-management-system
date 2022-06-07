package com.ty.hotelmanagement.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomNo;
	private String roomType;
	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	private double cost;
	@OneToMany
	private List<Room>rooms;
	
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public LocalDateTime getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(LocalDateTime checkIn) {
		this.checkIn = checkIn;
	}
	public LocalDateTime getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(LocalDateTime checkOut) {
		this.checkOut = checkOut;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
