package com.example.demo.Service;

import com.example.demo.dto.SearchByNameDto;
import com.example.demo.model.Products;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void findByProductName(SearchByNameDto searchByNameDto) {
        String s = searchByNameDto.getName();

        List<Products> products = new ArrayList<>();

        products.add(productRepository.findAllByNameLike(s));


    }

}
