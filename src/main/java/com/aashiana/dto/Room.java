package com.aashiana.dto;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Room {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int roomId;
	private int roomNumber;
	private RoomType roomType;
	private RoomStatus roomStatus;
	@ManyToOne
	@JoinColumn(name="hotelId")
	private Hotel hotel;
	@ManyToOne
	@JoinColumn(name="bookingId")
	private Booking booking;
	
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Enumerated(EnumType.STRING)
	public RoomType getRoomType() {
		return roomType;
	}
	@Enumerated(EnumType.STRING)
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	@Enumerated(EnumType.STRING)
	public RoomStatus getRoomStatus() {
		return roomStatus;
	}
	@Enumerated(EnumType.STRING)
	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}

}
