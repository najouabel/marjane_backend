package com.app.marjane_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Table(name = "product_promotion")
public class ProductPromotion extends Promotion{
  @OneToOne
    private Product product;
}
