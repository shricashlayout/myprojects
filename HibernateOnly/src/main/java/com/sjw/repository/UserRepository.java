package com.sjw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjw.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
