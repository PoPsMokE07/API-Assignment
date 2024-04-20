package com.me.irctcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.irctcdemo.model.Train;

@Repository
public interface TrainRepositoy extends JpaRepository<Train,Long> {

}
