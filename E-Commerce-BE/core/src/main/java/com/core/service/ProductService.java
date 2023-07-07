package com.core.service;

import com.core.dao.CategoryRepository;
import com.core.dao.ProductRepository;
import com.core.model.Category;
import com.core.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    //TODO product service için methodlar yazılacak
    //ürün listeleme
    // id ye göre ürün getirme
    public String print() {//deneme methodudur silinecek
        Product product = new Product();
        product.setBrand("arzum");
        Category category = new Category();
        category.setName("categori");
        product.setCategory(category);
        product.setName("product");
        categoryRepository.save(category);
        productRepository.save(product);
        System.out.println(productRepository.findAll().get(0).toString());
        System.out.println(productRepository.findAll().get(0).getName());
        return productRepository.findAll().get(0).toString();
    }

}
