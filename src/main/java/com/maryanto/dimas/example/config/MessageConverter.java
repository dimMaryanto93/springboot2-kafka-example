package com.maryanto.dimas.example.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configurable
public class MessageConverter {

    @Bean
    public RecordMessageConverter converter() {
        return new StringJsonMessageConverter();
    }

}
