package com.shepa.lesson3.controllers;

import com.shepa.lesson3.content.Product;
import com.shepa.lesson3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @GetMapping(value = "/addProduct")
    public String index(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-form";
    }

    @PostMapping(value = "/resultForm")
    @ResponseBody
    public Product resultForm(@ModelAttribute("product") Product product) {
        productService.addProduct(product);
        return product;
    }

    @GetMapping(value = "/listProducts")
    @ResponseBody
    public List<Product> listProducts(){
        return productService.getProducts();
    }


}
