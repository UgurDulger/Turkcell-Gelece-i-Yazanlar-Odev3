package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.dataAccess.abstracts.BrandRepository;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Override
    public Brand add(Brand brand) {
        //todo:business rules
       Brand createdBrand =  brandRepository.save(brand);
        return createdBrand;
    }

    @Override
    public Brand update(Brand brand) {
        Optional<Brand> brand1 = brandRepository.findById(brand.getId());
        if(brand1.isPresent()){
            Brand existingBrand = brand1.get();
            existingBrand.setName(brand.getName());
            return brandRepository.save(existingBrand);
        }else {
            throw new IllegalArgumentException("brand id not found");
        }


    }

    @Override
    public void delete(int id) {
        brandRepository.deleteById(id);

    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Optional<Brand> getById(int id) {

        return brandRepository.findById(id);
    }
}
