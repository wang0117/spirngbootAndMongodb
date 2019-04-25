package com.example.wch.MySpringBootTest.web.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月23日: 下午3:16:25
 */
@Data
@AllArgsConstructor
@ToString
public class User {
	 
	@Id
	private Integer id;
	private String name;
	private Integer age;

}
