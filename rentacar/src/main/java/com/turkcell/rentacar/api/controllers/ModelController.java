package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/models")
public class ModelController {
    private ModelService modelService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Model add(@RequestBody Model model){
        return modelService.add(model);
    }
    @PutMapping
    public Model update(@RequestBody Model model){
        return modelService.update(model);
    }
    @DeleteMapping("/{id}")
    public void delete(int id){
        modelService.delete(id);
    }
    @GetMapping
    public List<Model> getAll(){
        return  modelService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Model> getById (int id){
        return modelService.getById(id);
    }
}
