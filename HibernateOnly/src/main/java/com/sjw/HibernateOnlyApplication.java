package com.sjw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sjw.entity.Users;
import com.sjw.repository.UserRepository;

@SpringBootApplication
public class HibernateOnlyApplication  implements CommandLineRunner{

	@Autowired
	private UserRepository usersRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateOnlyApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("First Program to write to DB");
		Users user1 = new Users(3L,"Shrinidhi","shri");
		usersRepository.saveAndFlush(user1);
		
		
	}
}
