package com.aashiana.dto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Booking {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	
	@OneToMany
	private Collection<Room> bookedRoomList = new ArrayList<Room>();
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;
	
	private int amount;
	private PaymentStatus  paymentStatus;
	@Temporal (TemporalType.DATE)
	private Date bookingTime;
	private Date durationFrom;
	private Date durationTo;

public Date getDurationFrom() {
		return durationFrom;
	}
	public void setDurationFrom(Date durationFrom) {
		this.durationFrom = durationFrom;
	}
	public Date getDurationTo() {
		return durationTo;
	}
	public void setDurationTo(Date durationTo) {
		this.durationTo = durationTo;
	}
public Date getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}
		@Embedded
	private Duration duration;
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Collection<Room> getBookedRoomList() {
		return bookedRoomList;
	}
	public void setBookedRoomList(Collection<Room> bookedRoomList) {
		this.bookedRoomList = bookedRoomList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
