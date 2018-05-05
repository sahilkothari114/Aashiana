package com.aashiana.dto;



import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class Duration {
	
	private Date Bookingfrom;
	
	private Date Bookingto;

	public Date getBookingfrom() {
		return Bookingfrom;
	}
	
	public void setBookingfrom(Date bookingfrom) {
		Bookingfrom = bookingfrom;
	}
	
	public Date getBookingto() {
		return Bookingto;
	}

	public void setBookingto(Date bookingto) {
		Bookingto = bookingto;
	}

}
