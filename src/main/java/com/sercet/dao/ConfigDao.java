package com.sercet.dao;

import com.sercet.vo.ConfigInfo;
import com.sercet.vo.ConfigMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by john on 2017/11/13.
 */
public interface ConfigDao {

    void addConfigMessage( ConfigMessage configMessage);

    void addConfigInfo(ConfigInfo configInfo);

    List<ConfigMessage> getAllMessage();

    List<ConfigInfo> getInfoByMessageID(@Param("id") String messageId);
}
