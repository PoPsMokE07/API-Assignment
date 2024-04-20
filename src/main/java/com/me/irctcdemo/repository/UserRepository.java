package com.me.irctcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.irctcdemo.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
