package com.example.kafka.DTO;

import java.util.Map;

public class MessageDTO {

    String topic;
    Map<String, String> message;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public  Map<String, String> getMessage() {
        return message;
    }

    public void setMessage( Map<String, String> message) {
        this.message = message;
    }
}
