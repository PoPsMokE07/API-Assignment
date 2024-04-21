package com.me.irctcdemo.controller;
import com.me.irctcdemo.model.Booking;
import com.me.irctcdemo.model.Train;
import com.me.irctcdemo.model.User;
import com.me.irctcdemo.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/gettrain/{origin}/{destination}")
    public List<Train> getAllTrains(@PathVariable("origin") String origin,@PathVariable("destination") String destination){
        
        return userService.getTrain(origin, destination);
    }
    @GetMapping("/bookticket/{trainname}/{userName}")
    public String bookTicket(@PathVariable("trainname") String trainName,@PathVariable("userName") String userName ){
        
        return userService.bookTrain(trainName, userName);
    }
    @GetMapping("/getbooking/{id}")
    public Booking getBooking(@PathVariable("id") long id  ){
        
        return userService.getBooking(id);
    }
    @PostMapping("/register")
    public String register(@RequestBody User user){
        if(userService.register(user)){
            return "Registration Successful";
        }
        
        return "registration Failed";
    }


}

