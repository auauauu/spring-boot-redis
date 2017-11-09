package com.guanglee.weixin.modular.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guanglee.weixin.modular.sys.mapper.UserMapper;
import com.guanglee.weixin.modular.sys.model.User;
import com.guanglee.weixin.modular.sys.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;
	
	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return mapper.findById(id);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		mapper.deleteById(id);
	}

}
