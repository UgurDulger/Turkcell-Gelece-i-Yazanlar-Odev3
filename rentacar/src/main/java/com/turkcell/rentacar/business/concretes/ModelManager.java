package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.dataAccess.abstracts.BrandRepository;
import com.turkcell.rentacar.dataAccess.abstracts.ModelRepository;
import com.turkcell.rentacar.entities.concretes.Brand;
import com.turkcell.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    @Override
    public Model add(Model model) {
        Model createdModel =  modelRepository.save(model);
        return createdModel;
    }

    @Override
    public Model update(Model model) {
        Optional<Model> brand1 = modelRepository.findById(model.getId());
        if(brand1.isPresent()){
            Model existingModel= brand1.get();
            existingModel.setModelType(model.getModelType());
            return modelRepository.save(existingModel);
        }else {
            throw new IllegalArgumentException("model id not found");
        }


    }

    @Override
    public void delete(int id) {
        modelRepository.deleteById(id);
    }

    @Override
    public List<Model> getAll() {
        return modelRepository.findAll();
    }

    @Override
    public Optional<Model> getById(int id) {
        return modelRepository.findById(id);
    }
}
