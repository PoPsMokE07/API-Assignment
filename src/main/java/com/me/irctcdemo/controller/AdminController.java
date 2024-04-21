package com.me.irctcdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.irctcdemo.model.Train;
import com.me.irctcdemo.service.TrainService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private TrainService trainService;
    @PostMapping("/addtrain")
    public String addTrain(@RequestBody Train train){
        if(trainService.addTrain(train)){
            return "Train Added Successfully";
        }

        return "Failed To Add Train";
    }

}
