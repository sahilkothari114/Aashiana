package com.aashiana.dto;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@Entity
public class Facility {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
private int facilitiesId;
private String facilityName;
//collection of hotels in Facility object
@ManyToMany(mappedBy="facilityList")
private Collection<Hotel> hotelList = new ArrayList<Hotel>();
public int getFacilitiesId() {
	return facilitiesId;
}

public void setFacilitiesId(int facilitiesId) {
	this.facilitiesId = facilitiesId;
}

public String getFacilityName() {
	return facilityName;
}

public void setFacilityName(String facilityName) {
	this.facilityName = facilityName;
}

public Collection<Hotel> getHotelList() {
	return hotelList;
}

public void setHotelList(Collection<Hotel> hotelList) {
	this.hotelList = hotelList;
}


}

