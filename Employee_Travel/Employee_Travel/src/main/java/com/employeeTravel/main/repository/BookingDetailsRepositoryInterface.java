package com.employeeTravel.main.repository;

import com.employeeTravel.main.domain.BookingDetails;
import com.employeeTravel.main.domain.RequestDetails;

public interface BookingDetailsRepositoryInterface {
	public boolean viewBookingDetailsById(BookingDetails bookingDetails);
}
