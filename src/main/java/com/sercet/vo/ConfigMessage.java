package com.sercet.vo;

/**
 * Created by john on 2017/11/13.
 */
public class ConfigMessage {
    private int cmId;
    private String cmMessage;
    private String cmTime;

    public int getCmId() {
        return cmId;
    }

    public void setCmId(int cmId) {
        this.cmId = cmId;
    }

    public String getCmMessage() {
        return cmMessage;
    }

    public void setCmMessage(String cmMessage) {
        this.cmMessage = cmMessage;
    }

    public String getCmTime() {
        return cmTime;
    }

    public void setCmTime(String cmTime) {
        this.cmTime = cmTime;
    }
}
