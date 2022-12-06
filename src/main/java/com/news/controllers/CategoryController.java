package com.news.controllers;

import com.news.dao.CategoryRepository;
import com.news.entities.Category;
import com.news.requestmodels.CategoryRequest;
import com.news.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {


    @Autowired
//    private CategoryRepository categoryRepository;
    private CategoryService categoryService;
    public CategoryController( CategoryService categoryService) {
//        this.categoryRepository = categoryRepository;
        this.categoryService = categoryService;
    }


//    @GetMapping("/")
//    public List<Category> getAll(){
//        return this.categoryRepository.findAll();
//    }


    @PostMapping("/")
    public void postCategory(@RequestBody CategoryRequest categoryRequest) throws Exception {
        System.out.println(categoryRequest);
        this.categoryService.postCategory(categoryRequest);
    }
}
