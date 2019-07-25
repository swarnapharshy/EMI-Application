package com.apiconsumer.emiconsumer.controllers;

import com.apiconsumer.emiconsumer.entities.EmiEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController("/")
public class EmiConsumerController {

    @RequestMapping(path = "/emiconsumer")
    @ResponseBody
    public EmiEntity emiconsumer(@RequestBody EmiEntity emiEntity) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/emicalculator/")
                .queryParam("emiEntity", emiEntity);

        RestTemplate restTemplate = new RestTemplate();

        emiEntity.setEMI(restTemplate.postForEntity("http://localhost:8080/emicalculator/", emiEntity, Double.class).getBody());

        return emiEntity;
    }
}
