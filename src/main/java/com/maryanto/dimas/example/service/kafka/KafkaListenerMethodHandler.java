package com.maryanto.dimas.example.service.kafka;

import com.maryanto.dimas.example.model.Notification;
import com.maryanto.dimas.example.model.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@KafkaListener(id = "payment-gateway-consumer", topics = {"payment", "notification"})
public class KafkaListenerMethodHandler {

    @KafkaHandler
    public void getPaymentMethod(Payment payment) {
        log.info("Received payment: {}", payment);
    }

    @KafkaHandler
    public void getNotification(Notification notif) {
        log.info("Received notification: {}", notif);
    }

    @KafkaHandler(isDefault = true)
    public void getMessage(String message) {
        log.info("Received unknown: {}", message);
    }

}
