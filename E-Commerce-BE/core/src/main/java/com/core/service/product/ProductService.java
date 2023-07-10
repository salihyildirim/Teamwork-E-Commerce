package com.core.service.product;

import com.core.dao.product.CategoryRepository;
import com.core.dao.product.ProductRepository;
import com.core.model.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public void print() {
        System.out.println(categoryRepository.findAll().get(0).getName()
        );
    }

    public  Product getProduct(String code) {
        return   productRepository.findByCode(code).get(0);
    }

    public List<Product> getProductsForCategory(long categoryID) {
        return productRepository.findAllByCategoryID(categoryID);
    }

    public List<Product> getProductsForCategory(String categoryName) {
        return productRepository.findAllByCategoryName(categoryName);
    }


    public Integer getProductsCountForCategory(String categoryName) {
        return productRepository.getCountForCategory(categoryName);
    }
}
