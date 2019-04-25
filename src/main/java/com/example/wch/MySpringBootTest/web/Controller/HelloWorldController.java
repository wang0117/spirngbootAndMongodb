package com.example.wch.MySpringBootTest.web.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wch.MySpringBootTest.web.dto.User;
import com.example.wch.MySpringBootTest.web.service.UserRepository;
import com.example.wch.MySpringBootTest.web.service.UserService;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月22日: 下午5:11:39
 */
@RestController
@RequestMapping("/MyTest")
public class HelloWorldController {
	@Value("${name}")
	private String name;
	@RequestMapping("/hello")
	public String HelloWorld(){
		return name + ": hello";
	}
	
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private UserRepository userRepository;
	@Resource
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return  mongoTemplate.findAll(User.class);
	}
	
	@RequestMapping("/findByUserName")
	public User findByUserName(String userName){
		return userRepository.findByName(userName);
	}
	
	@RequestMapping("/saveUser")
	public void saveUser(Integer id,String userName,Integer age){
	    User user = new User(id, userName, age);
	    userRepository.save(user);
	    userService.save(user);
	}
}
