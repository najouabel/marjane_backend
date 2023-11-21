package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.AdministratorService;
import com.app.marjane_backend.entities.GeneralAdministrator;
import com.app.marjane_backend.repositories.GeneralAdministratorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GeneralAdministratorServiceImp implements AdministratorService<GeneralAdministrator>  {
    private GeneralAdministratorRepository repository;

    public GeneralAdministrator create(GeneralAdministrator generalAdministrator) {
        return repository.save(generalAdministrator);
    }

    public String delete(Long id) {
        Optional<GeneralAdministrator> administratorOptional = repository.findById(id);
        if (administratorOptional.isPresent()) {
            repository.deleteById(id);
            return "Center administrator deleted successfully";
        }
        return null;
    }
}
