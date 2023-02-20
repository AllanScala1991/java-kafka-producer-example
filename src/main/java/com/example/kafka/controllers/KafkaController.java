package com.example.kafka.controllers;

import com.example.kafka.DTO.MessageDTO;
import com.example.kafka.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class KafkaController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/send")
    public ResponseEntity<Object> sendMessage(@RequestBody MessageDTO messageDTO) {
        kafkaService.sendMessage(messageDTO.getTopic(), messageDTO.getMessage().toString());
        return ResponseEntity.status(HttpStatus.OK).body("Mensagem enviada com sucesso.");
    }

}
