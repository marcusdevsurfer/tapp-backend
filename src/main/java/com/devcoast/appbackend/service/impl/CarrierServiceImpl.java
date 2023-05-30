package com.devcoast.appbackend.service.impl;


import com.devcoast.appbackend.model.Carrier;
import com.devcoast.appbackend.repository.CarrierRepository;
import com.devcoast.appbackend.service.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrierServiceImpl implements CarrierService {
    @Autowired
    CarrierRepository carrierRepository;
    @Override
    public List<Carrier> getAllCarriers() {
        return carrierRepository.findAll();
    }
}
