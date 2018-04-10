package com.aashiana.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Hotel {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int hotelId;
	private String hotelName;
	@Embedded
	private Address address;
	private float rating;
	//Collection of the rooms in a hotel object.
	@OneToMany(mappedBy="hotel")
	private Set<Room> roomList = new HashSet<Room>();
	//collection of facilities in hotel object
	@ManyToMany
	private Collection<Facility> facilityList= new ArrayList<Facility>();

	public Collection<Facility> getFacilityList() {
		return facilityList;
	}
	public void setFacilityList(Collection<Facility> facilityList) {
		this.facilityList = facilityList;
	}
	public Set<Room> getRoomList() {
		return roomList;
	}
	public void setRoomList(Set<Room> roomList) {
		this.roomList = roomList;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Set<Room> getroomList() {
		return roomList;
	}
	public void setroomList(Set<Room> roomList) {
		this.roomList = roomList;
	}
	
	
	
}
