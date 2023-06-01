package com.devcoast.appbackend.service;

import com.devcoast.appbackend.model.Carrier;
import com.devcoast.appbackend.repository.CarrierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarrierService {
    public List<Carrier> getAllCarriers();
}
