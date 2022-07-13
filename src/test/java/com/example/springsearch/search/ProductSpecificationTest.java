package com.example.springsearch.search;

import com.example.springsearch.SpringSearchApplication;
import com.example.springsearch.entity.Product;
import com.example.springsearch.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringSearchApplication.class)
class ProductSpecificationTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void demoTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ProductSpecification filter01 = new ProductSpecification(new SearchCriteria("price", ">=", 10000));
        ProductSpecification filter02 = new ProductSpecification(new SearchCriteria("price", "<=", 25000));
        List<Product> products = productRepository.findAll((Sort) filter01.and(filter02));
        System.out.println(products.size());
    }
}