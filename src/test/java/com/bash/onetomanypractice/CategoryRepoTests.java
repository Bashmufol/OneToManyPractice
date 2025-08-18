package com.bash.onetomanypractice;

import com.bash.onetomanypractice.model.Categories;
import com.bash.onetomanypractice.repository.CategoryRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CategoryRepoTests {

    @Autowired
    private CategoryRepo categoryRepo;

    @Test
    public void testCategoryRepo() {
        Categories category = new Categories();
        Categories savedCategories = categoryRepo.save(category);
        assertThat(savedCategories.getId()).isGreaterThan(0);

    }
}
