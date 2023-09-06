package com.codechartruex.mysms.model;

public class SmsData {
    private String sender;
    private String message;

    public SmsData(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}
