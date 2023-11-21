package com.app.marjane_backend.web;

import com.app.marjane_backend.Service.PromotionCategorieService;
import com.app.marjane_backend.entities.CategoryPromotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/promotionCategorie")
public class PromotionCategorieController {

    private final PromotionCategorieService promotionService;

    @Autowired
    public PromotionCategorieController(PromotionCategorieService promotionService) {
        this.promotionService = promotionService;
    }

    @PostMapping("/category")
    public ResponseEntity<String> createCategory(@RequestBody CategoryPromotion categoryPromotion) {
        Optional<CategoryPromotion> createdCategory = promotionService.create(categoryPromotion);
        if (createdCategory.isPresent()) {
            return new ResponseEntity<>("Success creating category", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Something went wrong when creating category", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<CategoryPromotion> getCategory(@PathVariable Long id) {
        Optional<CategoryPromotion> category = promotionService.read(id);
        return category.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    }

