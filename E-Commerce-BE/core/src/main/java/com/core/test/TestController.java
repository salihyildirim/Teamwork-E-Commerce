package com.core.test;

import com.core.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
//Core classının çalışmasını kontrol etmek amaçlı yazılmıştır silinecek
@Controller
public class TestController {
    @Resource
    private ProductService productService;
    @GetMapping("/test")
    public String print(){
        productService.print();
        return "oldu";
    }

}
