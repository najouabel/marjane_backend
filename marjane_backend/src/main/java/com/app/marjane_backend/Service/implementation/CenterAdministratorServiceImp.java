package com.app.marjane_backend.Service.implementation;
import com.app.marjane_backend.Service.AdministratorService;


import com.app.marjane_backend.entities.Administrator;
import com.app.marjane_backend.repositories.CenterAdministratorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
@AllArgsConstructor
public class CenterAdministratorServiceImp implements AdministratorService {

    private CenterAdministratorRepository repository;

    @Override
    public Administrator create(Administrator administrator) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
