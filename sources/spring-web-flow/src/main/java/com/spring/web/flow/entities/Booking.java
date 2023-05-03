package com.spring.web.flow.entities;

public class Booking {

  private Long id;

  private User user;

  private Hotel hotel;

  private String creditCard;

  private String creditCardName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public String getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(String creditCard) {
    this.creditCard = creditCard;
  }

  public String getCreditCardName() {
    return creditCardName;
  }

  public void setCreditCardName(String creditCardName) {
    this.creditCardName = creditCardName;
  }
}
