package com.app.marjane_backend.web;

import com.app.marjane_backend.Service.implementation.GeneralAdministratorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generalAdmin")
public class GeneralAdministratorController {
    private final GeneralAdministratorServiceImp service;

    @Autowired
    public GeneralAdministratorController(GeneralAdministratorServiceImp generalAdministratorServiceImp) {
        this.service = generalAdministratorServiceImp;

    }

}
