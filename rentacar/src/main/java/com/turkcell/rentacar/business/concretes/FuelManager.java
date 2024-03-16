package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.dataAccess.abstracts.FuelRepository;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class FuelManager implements FuelService {
    private FuelRepository fuelRepository;
    @Override
    public Fuel add(Fuel fuel) {
        Fuel createdFuel =  fuelRepository.save(fuel);
        return createdFuel;

    }
    @Override
    public Fuel update(Fuel fuel) {
        Optional<Fuel> fuel1 = fuelRepository.findById(fuel.getId());
        if(fuel1.isPresent()){
            Fuel existingFuel = fuel1.get();
            existingFuel.setFuelType(fuel.getFuelType());
            return fuelRepository.save(existingFuel);
        }else {
            throw new IllegalArgumentException("fuel id not found");
        }
    }

    @Override
    public void delete(int id) {
        fuelRepository.deleteById(id);
    }

    @Override
    public List<Fuel> getAll() {
        return fuelRepository.findAll();
    }

    @Override
    public Optional<Fuel> getById(int id) {
        return fuelRepository.findById(id);
    }
}
