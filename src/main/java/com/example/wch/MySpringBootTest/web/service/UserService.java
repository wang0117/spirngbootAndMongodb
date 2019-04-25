package com.example.wch.MySpringBootTest.web.service;

import org.springframework.stereotype.Repository;

import com.example.wch.MySpringBootTest.web.dto.User;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月23日: 下午3:26:38
 */
@Repository
public interface UserService {
	void save(User user);

    User findByName(String name);
}
