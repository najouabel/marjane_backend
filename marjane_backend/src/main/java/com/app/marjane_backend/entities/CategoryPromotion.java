package com.app.marjane_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "category_promotion")
public class CategoryPromotion extends Promotion{
    /*@OneToOne
    private Category category;*/
}
