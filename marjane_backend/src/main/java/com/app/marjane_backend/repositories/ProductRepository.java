package com.app.marjane_backend.repositories;

import com.app.marjane_backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product, Long> {

}
