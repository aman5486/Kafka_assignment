package com.example.aman;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

public class serialization implements Serializer<User>{

    @Override
    public byte[] serialize(String s,User user) {
        byte[] userToByte = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            userToByte = objectMapper.writeValueAsString(user).getBytes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userToByte;
    }
}