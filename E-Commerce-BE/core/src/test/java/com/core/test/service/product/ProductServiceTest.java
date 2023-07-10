package com.core.test.service.product;

import com.core.dao.product.CategoryRepository;
import com.core.dao.product.ProductRepository;
import com.core.model.product.Category;
import com.core.model.product.Product;
import com.core.service.product.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        productService = new ProductService(productRepository, categoryRepository);
    }

    @Test
    public void testGetProducts() {
        // Mock data
        List<Product> expectedProducts = new ArrayList<>();
        Category category1 = createCategory("category1", 1L);
        Category category2 = createCategory("category2", 2L);

      Product product1=  createProduct(category1, 1L, "001", "Product 1", "Brand 1", "image1");

        Product product2= createProduct(category2, 2L, "002", "Product 2", "Brand 2", "image2");

        expectedProducts.add(product1);
        expectedProducts.add(product2);
        when(productRepository.findAll()).thenReturn(expectedProducts);

        // Call the method to test
        List<Product> actualProducts = productService.getProducts();

        // Verify the result
        assertEquals(expectedProducts, actualProducts);
    }

    private Product createProduct(Category category, long id, String code, String name, String brand, String image) {
        Product product= new Product();
        product.setId(id);
        product.setCode(code);
        product.setName(name);
        product.setBrand(brand);
        product.setCategory(category);
        product.setImage(image);
        return product;
    }

    private Category createCategory(String category12, long l) {
        Category category = new Category();
        category.setName(category12);
        category.setId(l);
        return category;
    }

}
