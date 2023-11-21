package com.app.marjane_backend.Service.implementation;



import com.app.marjane_backend.Service.PromotionCategorieService;
import com.app.marjane_backend.entities.CategoryPromotion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PromotionCategorieServiceImp implements PromotionCategorieService {

    @Override
    public Optional<CategoryPromotion> create(CategoryPromotion CategoryPromotion) {
        return Optional.empty();
    }

    @Override
    public Optional<CategoryPromotion> read(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CategoryPromotion> readAll() {
        return null;
    }

    @Override
    public Optional<CategoryPromotion> update(CategoryPromotion CategoryPromotion) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}