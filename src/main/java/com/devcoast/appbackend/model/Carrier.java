package com.devcoast.appbackend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carrierName;
    @OneToMany
    private List<Unit> units;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Carrier{" +
                "id=" + id +
                ", carrierName='" + carrierName + '\'' +
                ", units=" + units +
                '}';
    }
}
