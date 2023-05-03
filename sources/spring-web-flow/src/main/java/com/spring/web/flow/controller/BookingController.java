package com.spring.web.flow.controller;

import com.spring.web.flow.service.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BookingController {

  private final BookingService bookingService;

  public BookingController(BookingService bookingService){
    this.bookingService = bookingService;
  }

  @GetMapping("booking")
  public String getBookingPage(){
    return "booking";
  }


}
