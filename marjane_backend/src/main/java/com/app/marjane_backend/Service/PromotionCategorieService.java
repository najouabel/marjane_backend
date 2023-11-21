package com.app.marjane_backend.Service;


import com.app.marjane_backend.entities.CategoryPromotion;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PromotionCategorieService {
    Optional<CategoryPromotion> create(CategoryPromotion CategoryPromotion);
    Optional<CategoryPromotion> read(Long id);
    List<CategoryPromotion> readAll();
    Optional<CategoryPromotion> update(CategoryPromotion CategoryPromotion);
    boolean delete(Long id);
}
