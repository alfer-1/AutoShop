package com.example.demo.repository;


import com.example.demo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
    Products findByName(String name);
    //findByNameLike  в данном случае не работает поэтому  используем  findByNameContains
    List <Products> findByNameContains(String name);


}
