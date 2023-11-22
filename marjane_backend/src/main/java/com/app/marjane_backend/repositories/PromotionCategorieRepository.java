package com.app.marjane_backend.repositories;

import com.app.marjane_backend.entities.PromotionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionCategorieRepository extends JpaRepository<PromotionCategory, Long> {
}
