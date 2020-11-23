package br.com.edysegura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

  @Autowired
  KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage() {
    kafkaTemplate.send("my-test-topic", "" + System.currentTimeMillis());
  }

}
