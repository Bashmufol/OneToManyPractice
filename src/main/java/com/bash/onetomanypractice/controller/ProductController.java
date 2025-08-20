package com.bash.onetomanypractice.controller;

import com.bash.onetomanypractice.model.Category;
import com.bash.onetomanypractice.model.Product;
import com.bash.onetomanypractice.repository.CategoryRepo;
import com.bash.onetomanypractice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;
    private final CategoryRepo categoryRepo;

    @GetMapping("/products/new")
    public String showNewProductForm(Model model) {
        List<Category> listCategories = categoryRepo.findAll();
        model.addAttribute("listCategories", listCategories);
        model.addAttribute("product", new Product());
        return "product_form";
    }
}
