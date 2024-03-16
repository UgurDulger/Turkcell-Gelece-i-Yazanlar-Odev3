package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/brands")
public class BrandsController {
    private BrandService brandService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Brand add(@RequestBody Brand brand){
        return brandService.add(brand);
    }
    @PutMapping
    public Brand update(@RequestBody Brand brand){
        return brandService.update(brand);
    }
    @DeleteMapping("/{id}")
    public void delete(int id){
        brandService.delete(id);
    }
    @GetMapping
    public List<Brand> getAll(){
        return  brandService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Brand> getById (int id){
        return brandService.getById(id);
    }
}