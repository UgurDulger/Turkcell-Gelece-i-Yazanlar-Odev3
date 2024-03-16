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
@Table(name = "models")
public class Model extends BaseEntity {
    @Column(name = "modeltype")
    private String modelType;
}
