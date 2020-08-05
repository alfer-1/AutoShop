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
// создаем метод для поиска продуктов  по описанию (name). Возвращаемый тип List<Products>
    public List<Products> findByProductName(SearchByNameDto searchByNameDto) {
        // создаем переменную s и присваиваем ей имя полученное после нажатия кнопки "Найти"
        String s = searchByNameDto.getName();
// создаем новую коллекцию products типа Products
        List<Products> products = new ArrayList<>();
// в созданную коллекцию products помещаем коллекцию созданную после запроса productRepository.findByNameContains(s)
        products.addAll(productRepository.findByNameContains(s));
// возвращаем коллекцию products
        return products;

    }

}
