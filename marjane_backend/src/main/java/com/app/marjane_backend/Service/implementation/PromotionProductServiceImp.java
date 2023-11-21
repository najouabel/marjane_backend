package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.PromotionProductService;
import com.app.marjane_backend.entities.ProductPromotion;
import com.app.marjane_backend.repositories.PromotionProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionProductServiceImp implements PromotionProductService {

    private final PromotionProductRepository repository;

    @Autowired
    public PromotionProductServiceImp(PromotionProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductPromotion create(ProductPromotion productPromotion) {
        return repository.save(productPromotion);
    }

    @Override
    public ProductPromotion read(Long id) {
        Optional<ProductPromotion> productPromotionOptional = repository.findById(id);
        return productPromotionOptional.orElse(null);
    }

    @Override
    public List<ProductPromotion> readAll() {
        return repository.findAll();
    }

    @Override
    public ProductPromotion update(ProductPromotion productPromotion) {
       return repository.save(productPromotion);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
