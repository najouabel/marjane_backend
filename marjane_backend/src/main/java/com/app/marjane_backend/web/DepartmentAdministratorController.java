package com.app.marjane_backend.web;


import com.app.marjane_backend.Service.implementation.DepartmentAdministratorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departmentAdmin")
public class DepartmentAdministratorController {
    private DepartmentAdministratorServiceImp service;

    @Autowired
    public DepartmentAdministratorController(DepartmentAdministratorServiceImp departmentAdministratorServiceImp) {
        this.service = departmentAdministratorServiceImp;
    }


}
