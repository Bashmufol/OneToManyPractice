package com.bash.onetomanypractice.repository;

import com.bash.onetomanypractice.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Categories, Integer> {
}
