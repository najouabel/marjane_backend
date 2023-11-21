package com.app.marjane_backend.Service.implementation;



import com.app.marjane_backend.Service.PromotionProductService;
import com.app.marjane_backend.entities.ProductPromotion;
import com.app.marjane_backend.repositories.PromotionProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PromotionProductServiceImp implements PromotionProductService {

    @Override
    public ProductPromotion create(ProductPromotion ProductPromotion) {
        return null;
    }

    @Override
    public ProductPromotion read(Long id) {
        return null;
    }

    @Override
    public List<ProductPromotion> readAll() {
        return null;
    }

    @Override
    public ProductPromotion update(ProductPromotion ProductPromotion) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}