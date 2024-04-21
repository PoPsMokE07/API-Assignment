package com.me.irctcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.irctcdemo.model.Booking;
import com.me.irctcdemo.model.Train;
import com.me.irctcdemo.model.User;
import com.me.irctcdemo.repository.BookingRepository;
import com.me.irctcdemo.repository.TrainRepositoy;
import com.me.irctcdemo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private TrainRepositoy trainRepositoy;
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Train> getTrain(String origin, String destination){
        return trainRepositoy.getTrainByOriginAndDestination(origin,destination);

    }

    public boolean register(User user) {
        if(userRepository.getByUserName(user.getUserName())!=null){
            return false;

        }
        userRepository.save(user);
        return true;
    }
    public String bookTrain(String trainName,String userName){
        Train train=trainRepositoy.getByName(trainName);
        if(train.getCapacity()<=0){
            return "Train is Full";
        }
        User user=userRepository.getByUserName(userName);

        Booking booking=new Booking();

        booking.setTrainId(train.getId());
        booking.setUserId(user.getId());
        long bookingId=bookingRepository.save(booking).getId();
        train.setCapacity(train.getCapacity()-1);
        trainRepositoy.save(train);
        return "Booking Successfull,id="+bookingId;
    }
    public Booking getBooking(long id){
        Booking booking=bookingRepository.getById(id);
        return booking;
        

    }

    

}
