package com.application.emicalculator.controllers;

import com.application.emicalculator.entities.EmiEntity;
import com.application.emicalculator.services.EmiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class EmiController {

    @Autowired
    EmiServiceImpl emiService;

    @RequestMapping(path = "/emicalculator", method = RequestMethod.POST)
    @ResponseBody
    public double emicalculator(@RequestBody EmiEntity emiEntity) {
        return emiService.emicalculator(emiEntity);
    }

}
