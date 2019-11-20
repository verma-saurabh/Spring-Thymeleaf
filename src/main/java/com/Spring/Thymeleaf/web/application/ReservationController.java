package com.Spring.Thymeleaf.web.application;

import com.Spring.Thymeleaf.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @RequestMapping(method= RequestMethod.GET)
    public String getReservations(){
        return "reservations";
    }
}
