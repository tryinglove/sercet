package com.sercet.service;

import com.sercet.vo.ConfigInfo;
import com.sercet.vo.ConfigMessage;

/**
 * Created by john on 2017/11/13.
 */
public interface IConfigService {
    String addConfigMessage(ConfigMessage configMessage);

    String addConfigInfo(int messageId, ConfigInfo configInfo);
}
