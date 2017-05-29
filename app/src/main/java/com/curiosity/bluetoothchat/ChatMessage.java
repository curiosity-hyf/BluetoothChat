package com.curiosity.bluetoothchat;

/**
 * 消息实体
 */
public class ChatMessage {

    public static final int MSG_SENDER_ME = 0;
    public static final int MSG_SENDER_OTHERS = 1;

    public int messageSender;
    public String messageContent;
}
