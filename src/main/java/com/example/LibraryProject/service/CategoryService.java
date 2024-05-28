package com.example.LibraryProject.service;
import com.example.LibraryProject.entity.Category;
import com.example.LibraryProject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        return category;
    }

    public void createCategory(Category category){
        categoryRepository.save(category);
    }
    public void updateCategory(Category category){
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        categoryRepository.deleteById(category.getId());
    }
}