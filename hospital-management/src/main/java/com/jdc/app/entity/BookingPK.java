package com.jdc.app.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookingPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	@Column(name = "book_time")
	private LocalDateTime bookingTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookingTime, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingPK other = (BookingPK) obj;
		return Objects.equals(bookingTime, other.bookingTime) && id == other.id;
	}

}
