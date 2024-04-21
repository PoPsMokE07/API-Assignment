package com.me.irctcdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.irctcdemo.model.Train;
import com.me.irctcdemo.repository.TrainRepositoy;

@Service

public class TrainService {
    @Autowired
    private TrainRepositoy trainRepositoy;

    public boolean addTrain(Train train){
        if(trainRepositoy.save(train)!=null){
            return true;
        }
        return false;

    }

}
