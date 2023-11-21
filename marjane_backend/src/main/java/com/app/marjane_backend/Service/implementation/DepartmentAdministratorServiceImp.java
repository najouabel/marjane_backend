package com.app.marjane_backend.Service.implementation;


import com.app.marjane_backend.Service.AdministratorService;
import com.app.marjane_backend.entities.Administrator;
import com.app.marjane_backend.entities.CenterAdministrator;
import com.app.marjane_backend.entities.DepartmentAdministrator;
import com.app.marjane_backend.repositories.DepartmentAdministratorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DepartmentAdministratorServiceImp implements AdministratorService<DepartmentAdministrator> {
    private DepartmentAdministratorRepository repository;

    @Override
    public DepartmentAdministrator create(DepartmentAdministrator administrator) {
        return repository.save(administrator);
    }

    @Override
    public String delete(Long id) {
        Optional<DepartmentAdministrator> administratorOptional = repository.findById(id);
        if (administratorOptional.isPresent()) {
            repository.deleteById(id);
            return "Center administrator deleted successfully";
        }
        return null;
    }
}

