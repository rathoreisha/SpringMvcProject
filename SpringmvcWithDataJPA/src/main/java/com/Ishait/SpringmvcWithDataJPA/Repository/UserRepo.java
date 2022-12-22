package com.Ishait.SpringmvcWithDataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ishait.SpringmvcWithDataJPA.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
