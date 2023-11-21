package com.app.marjane_backend.web;


import com.app.marjane_backend.Service.implementation.CenterAdministratorServiceImp;
import com.app.marjane_backend.entities.Administrator;
import com.app.marjane_backend.entities.CenterAdministrator;
import com.app.marjane_backend.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/centerAdministrator")
@AllArgsConstructor
public class CenterAdministratorController {
    private final CenterAdministratorServiceImp centerAdministratorService;
    @PostMapping
    public CenterAdministrator create(@RequestBody CenterAdministrator centerAdministrator) {
        return (CenterAdministrator) centerAdministratorService.create(centerAdministrator);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCenterAdministrator(@PathVariable Long id) {
        String result = centerAdministratorService.delete(id);
        if (result != null) {
            return new ResponseEntity<>("Center administrator deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Center administrator not found", HttpStatus.NOT_FOUND);
    }
}
