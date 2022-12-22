package com.Ishait.SpringmvcWithDataJPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ishait.SpringmvcWithDataJPA.Model.User;
import com.Ishait.SpringmvcWithDataJPA.Repository.UserRepo;

@Service
public class Serviceimpl implements UserseriviceI{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User saveuser(User user) {
		User save = userRepo.save(user);
		return save;
	}

}
