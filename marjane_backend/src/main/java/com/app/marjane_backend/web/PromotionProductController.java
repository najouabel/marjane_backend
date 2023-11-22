package com.app.marjane_backend.web;


import com.app.marjane_backend.Service.implementation.PromotionProductServiceImp;
import com.app.marjane_backend.entities.PromotionProduct;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/promotion")

@AllArgsConstructor
public class PromotionProductController {
    private final PromotionProductServiceImp service;


    @PostMapping
    public ResponseEntity<String> createProductPromotion(@RequestBody PromotionProduct promotionProduct) {
        PromotionProduct createdPromotionProduct = service.create(promotionProduct);
        if (createdPromotionProduct != null) {
            return new ResponseEntity<>("Success creating product promotion", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Something went wrong when creating product promotion", HttpStatus.INTERNAL_SERVER_ERROR);
    }

   }
