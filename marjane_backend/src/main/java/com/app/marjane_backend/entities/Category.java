package com.app.marjane_backend.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@NoArgsConstructor
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uuid;
    private String name;
    /*@OneToOne(mappedBy = "category")
    private CategoryPromotion categoryPromotion;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> products;*/
}
