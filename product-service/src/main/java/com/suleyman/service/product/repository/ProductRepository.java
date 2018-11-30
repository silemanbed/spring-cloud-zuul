package com.suleyman.service.product.repository;

import com.suleyman.service.product.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{
}
