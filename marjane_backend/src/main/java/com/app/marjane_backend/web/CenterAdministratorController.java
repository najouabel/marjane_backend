package com.app.marjane_backend.web;

import com.app.marjane_backend.Service.AdministratorService;
import com.app.marjane_backend.entities.CenterAdministrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/centerAdministrator")
public class CenterAdministratorController {
    private final AdministratorService<CenterAdministrator> centerAdministratorService;

    @Autowired
    public CenterAdministratorController(AdministratorService<CenterAdministrator> centerAdministratorService) {
        this.centerAdministratorService = centerAdministratorService;
    }

    @PostMapping
    public ResponseEntity<CenterAdministrator> create(@RequestBody CenterAdministrator centerAdministrator) {
        CenterAdministrator createdAdministrator = centerAdministratorService.create(centerAdministrator);
        return createdAdministrator != null ?
                new ResponseEntity<>(createdAdministrator, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCenterAdministrator(@PathVariable Long id) {
        String result = centerAdministratorService.delete(id);
        return result != null ?
                new ResponseEntity<>("Center administrator deleted successfully", HttpStatus.OK) :
                new ResponseEntity<>("Center administrator not found", HttpStatus.NOT_FOUND);
    }
}
