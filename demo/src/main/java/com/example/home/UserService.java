package com.example.home;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.home.exception.NotFoundException;


@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;
    
    public User registerUser(User user) throws NoSuchAlgorithmException {
    	if(HomwApplication.mailValidator(user.getUsername()) && HomwApplication.passValidator(user.getPassword())) 
    	{
    			if (userRepository.findByUsername(user.getUsername()) != null) 
    			{
    				throw new NotFoundException();
    			}
    			user.setPassword(HomwApplication.passcripter(user.getPassword()));
               return userRepository.save(user);
        }
    	else {
    		throw new NotFoundException();
    	}
    }
    
    public boolean loginUser(String username, String password) throws NoSuchAlgorithmException {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(HomwApplication.passcripter(password))) {
            return true;
        }
        return false;
    }
	

}
