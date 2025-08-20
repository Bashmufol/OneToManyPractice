package com.bash.onetomanypractice.repository;

import com.bash.onetomanypractice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
