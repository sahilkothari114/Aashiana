package com.aashiana.dto;



import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class Duration {
	@Temporal (TemporalType.DATE)
	private Date from;
	@Temporal (TemporalType.DATE)
	private Date to;
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	
}
