package com.sapp.service;

import javax.annotation.Resource;




import org.springframework.stereotype.Service;

import com.sapp.dao.LoginDao;


@Service
public class LoginService {
	@Resource
    private LoginDao loginDao;

	public Integer getUserDetailByName(String userName, String password) {
		return loginDao.getUserDetailByName(userName,password);
	}
}
