package com.jdc.app.entity;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BookingPK id;
	@Column(nullable = false, name = "check_in_time")
	private LocalTime checkInTime;

	public BookingPK getId() {
		return id;
	}

	public void setId(BookingPK id) {
		this.id = id;
	}

	public LocalTime getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
	}

}
