package com.app.marjane_backend.Service;

import com.app.marjane_backend.entities.Administrator;

public interface AdministratorService {
    Administrator create(Administrator administrator);
    String delete(Long id);
}
