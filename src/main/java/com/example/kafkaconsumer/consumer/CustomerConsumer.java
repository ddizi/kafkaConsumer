package com.example.kafkaconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerConsumer {

    @KafkaListener(topics = "testTopic", groupId = "group_id")
    public void consume(String message) {
        log.info("Consumed message: " + message);
    }
}
