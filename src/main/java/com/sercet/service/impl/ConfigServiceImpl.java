package com.sercet.service.impl;

import com.sercet.dao.ConfigDao;
import com.sercet.service.IConfigService;
import com.sercet.vo.ConfigInfo;
import com.sercet.vo.ConfigMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2017/11/13.
 */
@Service
public class ConfigServiceImpl implements IConfigService {
    @Autowired
    ConfigDao configDao;
    @Override
    public String addConfigMessage(ConfigMessage configMessage) {
        configDao.addConfigMessage(configMessage);
        return "SUCCESS";
    }

    @Override
    public String addConfigInfo(int messageId, ConfigInfo configInfo) {
        configInfo.setCiCmId(messageId);
        configDao.addConfigInfo(configInfo);
        return "SUCCESS";
    }
}
