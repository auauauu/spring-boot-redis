package com.guanglee.weixin.modular.sys.service;

import com.guanglee.weixin.modular.sys.model.User;

public interface UserService {
	public User findById(String id);
	public void deleteById(String id);
	public void insertUser(User user);
}
