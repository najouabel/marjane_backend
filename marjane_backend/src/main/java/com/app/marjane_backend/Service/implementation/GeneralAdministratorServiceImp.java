package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.AdministratorService;
import com.app.marjane_backend.entities.Administrator;
import com.app.marjane_backend.entities.GeneralAdministrator;
import com.app.marjane_backend.repositories.GeneralAdministratorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GeneralAdministratorServiceImp implements AdministratorService {
    private GeneralAdministratorRepository repository;

    @Override
    public Administrator create(Administrator administrator) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
