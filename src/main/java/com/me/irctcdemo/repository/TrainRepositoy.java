package com.me.irctcdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.irctcdemo.model.Train;

@Repository
public interface TrainRepositoy extends JpaRepository<Train,Long> {

    List<Train> getTrainByOriginAndDestination(String origin, String destination);

    Train getByName(String trainName);

}
