package com.practice.micro_receiver.micro_receiver.controller;

import com.practice.micro_receiver.micro_receiver.model.Micro_Receiver;
import com.practice.micro_receiver.micro_receiver.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
public class ReceiverController {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public ReceiverService service;

    @GetMapping("exchange/Sender/{id}")
    public ResponseEntity<Micro_Receiver> getSenderObject(@PathVariable long id){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<Micro_Receiver> entity = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange("localhost:8081/sendmessage"+id, HttpMethod.GET, entity, Micro_Receiver.class);
    }
}
