package com.spring.web.flow.service;

import com.spring.web.flow.entities.Booking;
import com.spring.web.flow.entities.Hotel;
import java.util.List;

public interface BookingService {

  Booking createBooking(Long hotelId);

  List<Booking> findBookings(String userName);

  List<Hotel> findHotels();

  Hotel findHotelById(String hotelId);

  void cancelBooking(Long bookingId);

}
