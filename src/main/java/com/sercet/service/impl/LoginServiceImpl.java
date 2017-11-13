package com.sercet.service.impl;

import com.sercet.dao.AMUserDao;
import com.sercet.service.LoginService;
import com.sercet.vo.PBUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2017/11/11.
 */
@Service
public class LoginServiceImpl implements LoginService {
    final static String ERRORMESSAGE = "用户名或密码错误";
    @Autowired
    AMUserDao amUserDao;

    @Override
    public String login(PBUser pbUser) {
        if (amUserDao.getUser(pbUser.getUserName(),pbUser.getUserPassword()) == 1) {
             return "ok";
        }
        return ERRORMESSAGE;
    }
}
