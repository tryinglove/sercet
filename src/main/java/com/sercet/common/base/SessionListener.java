package com.sercet.common.base;

import com.sercet.vo.PBUser;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Map;

/**
 * Created by john on 2017/11/13.
 */
public class SessionListener implements HttpSessionListener {

    private Map Instance = LoginSessionMap.getInstance();

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        PBUser user = (PBUser)httpSessionEvent.getSession().getAttribute("user");
        Instance.put(user.getUserId(),null);
    }
}
