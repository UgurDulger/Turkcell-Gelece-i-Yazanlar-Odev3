package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.TransmissionsService;
import com.turkcell.rentacar.dataAccess.abstracts.TransmissionsRepository;
import com.turkcell.rentacar.entities.concretes.Brand;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TransmissionManager implements TransmissionsService {
    TransmissionsRepository transmissionsRepository;
    @Override
    public Transmission add(Transmission transmission) {
        Transmission createdFuel=  transmissionsRepository.save(transmission);
        return createdFuel;
    }

    @Override
    public Transmission update(Transmission transmission) {
        Optional<Transmission> transmission1 = transmissionsRepository.findById(transmission.getId());
        if(transmission1.isPresent()){
            Transmission existingTransmission= transmission1.get();
            existingTransmission.setTransmissionType(transmission.getTransmissionType());
            return transmissionsRepository.save(existingTransmission);
        }else {
            throw new IllegalArgumentException("transmission id not found");
        }
    }

    @Override
    public void delete(int id) {
        transmissionsRepository.deleteById(id);
    }

    @Override
    public List<Transmission> getAll() {
        return transmissionsRepository.findAll();
    }

    @Override
    public Optional<Transmission> getById(int id) {
        return transmissionsRepository.findById(id);
    }
}
