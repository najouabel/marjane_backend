package com.app.marjane_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Table(name = "promotion_product")
public class PromotionProduct extends Promotion{
  @OneToOne
    private Product product;

}
