package com.guanglee.weixin.modular.sys.mapper;

import com.guanglee.weixin.modular.sys.model.User;

public interface UserMapper {
	public User findById(String id);
	public void deleteById(String id);
}
