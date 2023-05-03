package com.spring.web.flow.service.impl;

import com.spring.web.flow.entities.Booking;
import com.spring.web.flow.entities.Hotel;
import com.spring.web.flow.service.BookingService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

  @Override
  public Booking createBooking(Long hotelId) {
    System.out.println("hello world");
    return new Booking();
  }

  @Override
  public List<Booking> findBookings(String userName) {
    return null;
  }

  @Override
  public List<Hotel> findHotels() {
    return null;
  }

  @Override
  public Hotel findHotelById(String hotelId) {
    return null;
  }

  @Override
  public void cancelBooking(Long bookingId) {

  }
}
