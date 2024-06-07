package com.psps.springboot_kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("publish/{message}")
    public String publish(@PathVariable("message") String message){
        kafkaTemplate.send("topicName",message);
        return "Message Published: "+ message;
    }
}
