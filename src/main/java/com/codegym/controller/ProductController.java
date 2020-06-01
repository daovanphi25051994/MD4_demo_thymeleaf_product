package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("products",productService.getAllProduct() );
        return "index";
    }
    @GetMapping("/delete/{id}")
    public String index(@PathVariable String id, Model model){
       productService.remove(id);
        model.addAttribute("products",productService.getAllProduct() );
        return "index";
    }
    @GetMapping("/edit/{id}")
    public String moveUpdatePage(@PathVariable String id, Model model){
        model.addAttribute("product",productService.getProduct(id));
        return "edit";
    }
    @PostMapping("/product/edit")
    public String update(Product product, RedirectAttributes redirect) {
        System.out.println(product.getName());
        System.out.println(product.getId());
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/";
    }
}
