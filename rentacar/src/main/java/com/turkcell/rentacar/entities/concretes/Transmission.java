package com.turkcell.rentacar.entities.concretes;

import com.fasterxml.jackson.databind.ser.Serializers;
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
@Table(name = "transmissions")
public class Transmission extends BaseEntity {
    @Column(name = "transmissiontype")
    private String transmissionType;
}
