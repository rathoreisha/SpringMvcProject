package com.Ishait.SpringmvcWithDataJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ishait.SpringmvcWithDataJPA.Model.User;
import com.Ishait.SpringmvcWithDataJPA.Repository.UserRepo;
import com.Ishait.SpringmvcWithDataJPA.Service.UserseriviceI;

@Controller
public class User_controller {
	
	@Autowired
	private UserseriviceI userseriviceI;
	
	@GetMapping("/register")
	public String loadform()
	{
		return "Registration";
	}
	
	@PostMapping("/Saveuser")
	public String register(User user)
	{
		System.out.println(user);
		User saveuser = userseriviceI.saveuser(user);
		
		if(saveuser!=null)
		{
			return "sucessreg";
		}	
		else 
		{
			return "Failreg";
		}
	}
	

}
