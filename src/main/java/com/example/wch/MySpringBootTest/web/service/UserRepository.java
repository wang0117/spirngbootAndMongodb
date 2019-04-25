package com.example.wch.MySpringBootTest.web.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.wch.MySpringBootTest.web.dto.User;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月23日: 下午3:25:24
 */

public interface UserRepository extends MongoRepository<User, String>{
	User findByName(String name);
}
