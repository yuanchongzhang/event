package com.zhangyu.eventbusdemo;

/**
 * Created by Administrator on 2017/2/6.
 */

public class SecondEvent {
    private String mMsg;
    public SecondEvent(String msg) {
        // TODO Auto-generated constructor stub
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }

}
