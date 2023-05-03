package com.spring.web.flow.controller;

import com.spring.web.flow.entities.Hotel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

  @GetMapping
  public String index(ModelMap modelMap){
    Hotel hotel = new Hotel();
    hotel.setId(1l);
    hotel.setName("hotel name");
    hotel.setAddress("hotel address");
    hotel.setCity("sai gon");

    modelMap.addAttribute("hotel", hotel);

    return "index";
  }

}
