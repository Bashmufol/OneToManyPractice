package com.bash.onetomanypractice;

import com.bash.onetomanypractice.model.Category;
import com.bash.onetomanypractice.repository.CategoryRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CategoryRepoTests {

    @Autowired
    private CategoryRepo categoryRepo;

    @Test
    public void testCategoryRepo() {
        Category category = new Category("Electronics");
        Category savedCategory = categoryRepo.save(category);
        assertThat(savedCategory.getId()).isGreaterThan(0);

    }
}
