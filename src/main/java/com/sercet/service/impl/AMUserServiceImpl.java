package com.sercet.service.impl;

import com.sercet.dao.AMUserDao;
import com.sercet.service.AMUserService;
import com.sercet.vo.PBUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AMUserServiceImpl implements AMUserService {
	@Autowired
    AMUserDao userDao;
	@Override
	public List<PBUser> getAll() {
		
		return userDao.getAll();
	}

}
