package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.model.Notification;
import com.maryanto.dimas.example.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @PostMapping(path = "/send/payment")
    public void send(@RequestBody Payment payment) {
        this.template.send(
                new GenericMessage<>(
                        payment, Collections.singletonMap(
                                KafkaHeaders.TOPIC, "payment")
                )
        );
    }

    @PostMapping(path = "/send/notification")
    public void send(@RequestBody Notification notif) {
        this.template.send(
                new GenericMessage<>(
                        notif, Collections.singletonMap(
                        KafkaHeaders.TOPIC, "notification")
                )
        );
    }
}
