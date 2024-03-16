package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {
    Brand add (Brand brand);
    Brand update(Brand brand);
    void delete (int id);
    List<Brand> getAll();
    Optional<Brand> getById (int id);
}
