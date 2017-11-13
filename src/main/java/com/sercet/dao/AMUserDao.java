package com.sercet.dao;

import com.sercet.vo.PBUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;




public interface AMUserDao {
	List<PBUser> getAll();
	int getUser(@Param("userName") String userName,@Param("password") String password);
}
