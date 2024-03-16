package com.turkcell.rentacar.business.abstracts;


import com.turkcell.rentacar.entities.concretes.Transmission;

import java.util.List;
import java.util.Optional;

public interface TransmissionsService {
    Transmission add (Transmission transmission);
    Transmission update(Transmission transmission);
    void delete (int id);
    List<Transmission> getAll();
    Optional<Transmission> getById (int id);
}
