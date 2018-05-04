package com.sapp.dao;

import org.apache.ibatis.annotations.Param;

public interface LoginDao {

	Integer getUserDetailByName(@Param("userName") String userName,@Param("password") String password);
}
