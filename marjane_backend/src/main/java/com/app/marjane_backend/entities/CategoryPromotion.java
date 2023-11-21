package com.app.marjane_backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "category_promotion")
public class CategoryPromotion extends Promotion{
    @OneToOne
    private Category category;
}
