package com.app.marjane_backend.Service;

import com.app.marjane_backend.entities.Administrator;

public interface AdministratorService<T> {
    T create(T administrator);
    String delete(Long id);
}


