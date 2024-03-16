package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fuels")
public class FuelController {
    private FuelService fuelService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Fuel add(@RequestBody Fuel fuel){
        return fuelService.add(fuel);
    }
    @PutMapping
    public Fuel update(@RequestBody Fuel fuel){
        return fuelService.update(fuel);
    }
    @DeleteMapping("/{id}")
    public void delete(int id){
        fuelService.delete(id);
    }
    @GetMapping
    public List<Fuel> getAll(){
        return  fuelService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Fuel> getById (int id){
        return fuelService.getById(id);
    }
}
