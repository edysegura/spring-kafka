package br.com.edysegura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/kafka-test")
public class KafkaController {

  @Autowired
  Producer producer;

  @GetMapping
  public String sendMessage() {
      producer.sendMessage();
      return "Message sent!";
  }

}
