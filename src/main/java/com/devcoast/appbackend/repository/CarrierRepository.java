package com.devcoast.appbackend.repository;

import com.devcoast.appbackend.model.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier,Long> {
}
