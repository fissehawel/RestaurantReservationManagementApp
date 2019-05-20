package edu.mum.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Reservation {
	
	@Id
	@Column(name = "Reservation Id")
	private Long reservationId;
	
	@Column(name = "Guest Id")
	private Long guestId;
	
	@Column(name = "Reserved Capacity")
	private int reservedCapacity;
	
	@Column(name = "Date Booked")
	private LocalDate dateBooked;
	
	@Column(name = "Reserved For Date")
	private LocalDate forDate;
	
	@Column(name = "Start Time")
	private LocalTime startTime;
	
	@Column(name = "End Time")
	private LocalTime endTime;
	
	
	@Column(name = "Booking Method")
	private BookingMethod bookingMethod;

	private List<Long> reservedTables;
	
	// Getters and Setters
	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public LocalDate getDateBooked() {
		return dateBooked;
	}

	public void setDateBooked(LocalDate dateBooked) {
		this.dateBooked = dateBooked;
	}

	public LocalDate getForDate() {
		return forDate;
	}

	public void setForDate(LocalDate forDate) {
		this.forDate = forDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public int getReservedCapacity() {
		return reservedCapacity;
	}

	public void setReservedCapacity(int reservedCapacity) {
		this.reservedCapacity = reservedCapacity;
	}

	public BookingMethod getBookingMethod() {
		return bookingMethod;
	}

	public void setBookingMethod(BookingMethod bookingMethod) {
		this.bookingMethod = bookingMethod;
	}

	public List<Long> getReservedTables() {
		return reservedTables;
	}

	public void setReservedTables(List<Long> reservedTables) {
		this.reservedTables = reservedTables;
	}
	
	
	
}
