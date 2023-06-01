package com.devcoast.appbackend.controllers;

import com.devcoast.appbackend.model.Carrier;
import com.devcoast.appbackend.service.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CarrierController {
    @Autowired
    CarrierService carrierService;
    @GetMapping("/carriers")
    public List<Carrier> retriveAllCarriers(){
        return carrierService.getAllCarriers();
    }
}
