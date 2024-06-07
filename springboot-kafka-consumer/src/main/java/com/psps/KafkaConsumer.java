package com.psps;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "topicName",groupId = "consumer-group")
    public void consume(String message){
        System.out.println("Consumed: "+ message);
    }
}
