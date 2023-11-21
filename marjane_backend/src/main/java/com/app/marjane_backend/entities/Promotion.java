package com.app.marjane_backend.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uuid;
    private float percentage;
}
