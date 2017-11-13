package com.sercet.common.base;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by john on 2017/11/13.
 * save session
 */
public class LoginSessionMap {
    private final static Map sessionMap = new HashMap();

    private LoginSessionMap(){
    }

    public static Map getInstance(){
        return sessionMap;
    }

}
