package com.app.marjane_backend.Service.implementation;


import com.app.marjane_backend.Service.AdministratorService;
import com.app.marjane_backend.entities.Administrator;
import com.app.marjane_backend.repositories.DepartmentAdministratorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DepartmentAdministratorServiceImp implements AdministratorService {
    private DepartmentAdministratorRepository repository;


    @Override
    public Administrator create(Administrator administrator) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
