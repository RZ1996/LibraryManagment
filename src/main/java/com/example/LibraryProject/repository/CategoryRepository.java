package com.example.LibraryProject.repository;

import com.example.LibraryProject.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
