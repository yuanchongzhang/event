package com.zhangyu.eventbusdemo;

/**
 * Created by Administrator on 2017/2/6.
 */

public class NewMessageEvent {

    public final String message;

    public NewMessageEvent(String message) {
        this.message = message;
    }
}
