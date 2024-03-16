package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Fuel;

import java.util.List;
import java.util.Optional;

public interface FuelService {
    Fuel add (Fuel fuel);
    Fuel update(Fuel fuel);
    void delete (int id);
    List<Fuel> getAll();
    Optional<Fuel> getById (int id);
}
