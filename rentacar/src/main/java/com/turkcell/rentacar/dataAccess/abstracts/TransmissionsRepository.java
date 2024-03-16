package com.turkcell.rentacar.dataAccess.abstracts;


import com.turkcell.rentacar.entities.concretes.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransmissionsRepository extends JpaRepository<Transmission,Integer> {
}
