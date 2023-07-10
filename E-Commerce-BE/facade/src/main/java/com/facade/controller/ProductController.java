package com.facade.controller;

import com.core.service.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    //Todo methodlar yazılacak
    //ürün listeleme
    //ürün id sine göre ürün getirme

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String print() {//Deneme amaçlı method silinecek
        System.out.println("\n------------------------------");
        productService.print();
        System.out.println("\n------------------------------");
        System.out.println(productService.getProduct("003").getBrand());
        System.out.println("\n------------------------------");
        System.out.println(productService.getProductsCountForCategory("Ayakkabi"));
        System.out.println("\n------------------------------");
        System.out.println(productService.getProductsForCategory("Ayakkabi"));
        System.out.println("\n------------------------------");
        System.out.println(productService.getProductsForCategory(1));

        return "hello";
    }


}
