package com.ty.hotelmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelId;
	private String hotelName;
	private String hotelAddress;
	private String hotelType;
	private String hotelwebsite;
	private long hotelPhone;
    @ManyToOne
    private Hotel hotel;
    
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public String getHotelwebsite() {
		return hotelwebsite;
	}
	public void setHotelwebsite(String hotelwebsite) {
		this.hotelwebsite = hotelwebsite;
	}
	
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public String getHotlewebsite() {
		return hotelwebsite;
	}
	public void setHotlewebsite(String hotlewebsite) {
		this.hotelwebsite = hotlewebsite;
	}
	public long getHotelPhone() {
		return hotelPhone;
	}
	public void setHotelPhone(long hotelPhone) {
		this.hotelPhone = hotelPhone;
	}
}
