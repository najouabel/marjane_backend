package com.app.marjane_backend.Service.implementation;
import com.app.marjane_backend.Service.AdministratorService;


import com.app.marjane_backend.entities.CenterAdministrator;
import com.app.marjane_backend.repositories.CenterAdministratorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class CenterAdministratorServiceImp implements AdministratorService<CenterAdministrator> {
    private CenterAdministratorRepository repository;

    public CenterAdministrator create(CenterAdministrator centerAdministrator) {
        return repository.save(centerAdministrator);
    }

    public String delete(Long id) {
        Optional<CenterAdministrator> administratorOptional = repository.findById(id);
        if (administratorOptional.isPresent()) {
            repository.deleteById(id);
            return "Center administrator deleted successfully";
        }
        return null;
    }
}
