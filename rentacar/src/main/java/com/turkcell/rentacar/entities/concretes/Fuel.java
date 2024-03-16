package com.turkcell.rentacar.entities.concretes;

import com.turkcell.rentacar.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter setterları yapar
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fuels")
public class Fuel extends BaseEntity {
    @Column(name = "fueltype")
    private String fuelType;
}
