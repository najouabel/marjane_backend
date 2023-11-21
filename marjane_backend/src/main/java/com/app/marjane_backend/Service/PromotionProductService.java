package com.app.marjane_backend.Service;



import com.app.marjane_backend.entities.ProductPromotion;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PromotionProductService {
    ProductPromotion create(ProductPromotion ProductPromotion);
    ProductPromotion read(Long id);
    List<ProductPromotion> readAll();
    ProductPromotion update(ProductPromotion ProductPromotion);
    String delete(Long id);
}
