package com.turkcell.rentacar.business.abstracts;


import com.turkcell.rentacar.entities.concretes.Model;

import java.util.List;
import java.util.Optional;

public interface ModelService {
    Model add (Model model);
    Model update(Model model);
    void delete (int id);
    List<Model> getAll();
    Optional<Model> getById (int id);
}
