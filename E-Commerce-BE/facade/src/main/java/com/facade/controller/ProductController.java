package com.facade.controller;

import com.core.service.ProductService;
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
        System.out.println("getMapping");
        productService.print();
        return "hello";
    }
    @GetMapping("/pf")
    public String profesyonelFonksiyonDeneme(){
        System.out.printf("yariya indirgenme fonksiyonu tanimlanmasi");
        return "hi";
    }


}
