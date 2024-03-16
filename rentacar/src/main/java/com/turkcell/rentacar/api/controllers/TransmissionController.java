package com.turkcell.rentacar.api.controllers;


import com.turkcell.rentacar.business.abstracts.TransmissionsService;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/transmissions")
public class TransmissionController {
    private TransmissionsService transmissionsService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Transmission add(@RequestBody Transmission transmission){
        return transmissionsService.add(transmission);
    }
    @PutMapping
    public Transmission update(@RequestBody Transmission transmission){
        return transmissionsService.update(transmission);
    }
    @DeleteMapping("/{id}")
    public void delete(int id){
        transmissionsService.delete(id);
    }
    @GetMapping
    public List<Transmission> getAll(){
        return  transmissionsService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Transmission> getById (int id){
        return transmissionsService.getById(id);
    }
}
