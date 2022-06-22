package io.haedoang.amqp;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * fileName : RabbitMQConfig
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
@Configuration
@AllArgsConstructor
public class RabbitMQConfig {

    private final ConnectionFactory connectionFactory;

    // to send message queue
    @Bean
    public AmqpTemplate amqpTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jacksonConverter());
        return rabbitTemplate;
    }

    // received message queue
    @Bean
    public SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory() {
        SimpleRabbitListenerContainerFactory factory =
                new SimpleRabbitListenerContainerFactory();

        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(jacksonConverter());

        return factory;
    }
    @Bean
    public MessageConverter jacksonConverter() {
        Jackson2JsonMessageConverter jackson2JsonMessageConverter =
                new Jackson2JsonMessageConverter();
        return jackson2JsonMessageConverter;
    }
}
