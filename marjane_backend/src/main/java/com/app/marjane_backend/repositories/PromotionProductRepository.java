package com.app.marjane_backend.repositories;

import com.app.marjane_backend.entities.ProductPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PromotionProductRepository extends JpaRepository<ProductPromotion, Long> {
}
