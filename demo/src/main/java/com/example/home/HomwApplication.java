package com.example.home;

import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class HomwApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomwApplication.class, args);
	}
	
	public static boolean mailValidator(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean result = email.matches(regex);
		
		if(result) return true;
		return false;
	}
	
	
	public static boolean passValidator(String pass) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
		boolean result = pass.matches(regex);
		if(result) return true;
		return false;
	}
	
	
	public static String passcripter(String pass) throws NoSuchAlgorithmException {
		return Encryption.toHexString(Encryption.getSHA(pass));
	}
	

}
