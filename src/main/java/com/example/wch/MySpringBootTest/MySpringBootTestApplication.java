package com.example.wch.MySpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.wch.MySpringBootTest.web.dto.User;
import com.example.wch.MySpringBootTest.web.service.UserRepository;

@SpringBootApplication
//public class MySpringBootTestApplication implements CommandLineRunner{
public class MySpringBootTestApplication {
	@Autowired
	private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootTestApplication.class, args);
	}
	
/*    public void run(String... args) throws Exception {
            repository.deleteAll();

            repository.save(new User(1,"name1",19));
            repository.save(new User(2,"name2",20));

            System.out.println("User found with findAll():");
            System.out.println("-------------------------------");
            for (User user : repository.findAll()) {
                System.out.println(user);
            }
            System.out.println("------------------------");

            System.out.println("User found with findByName('name1'):");
            System.out.println("--------------------------------");
            System.out.println(repository.findByName("name1"));


    }*/
	
}
