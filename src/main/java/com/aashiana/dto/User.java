package com.aashiana.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {
	
	public User(String firstName, String lastName, Date dateOfBirth, String mobileNumber,
			String emailAddress, String sex, String aadharNumber, String city) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.sex = sex;
		this.aadharNumber = aadharNumber;
		this.city = city;
		this.booking = booking;
	}
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int userId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Temporal (TemporalType.DATE) @Column
	private Date dateOfBirth;
	@Column
	private String mobileNumber;
	@Column
	private String emailAddress;
	@Column
	private String sex;
	@Column
	private String aadharNumber;
	@Column
	private String city;
	
	@OneToOne(mappedBy="user") 
	private Booking booking;
	
	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public int getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
