package com.example.wch.MySpringBootTest.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wch.MySpringBootTest.web.dto.User;
import com.example.wch.MySpringBootTest.web.service.UserRepository;
import com.example.wch.MySpringBootTest.web.service.UserService;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月23日: 下午3:28:10
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	
	@Override
	public User findByName(String name) {
		return this.findByName(name);
	}

}
