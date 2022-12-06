package com.news.services;

import com.news.dao.CategoryRepository;
import com.news.entities.Category;
import com.news.requestmodels.CategoryRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void postCategory(CategoryRequest categoryRequest){
        Category category = new Category();
        category.setCategory_name(categoryRequest.getCategory_name());

        categoryRepository.save(category);
    }
}
