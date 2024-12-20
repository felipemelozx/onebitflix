package com.felipemelozx.onebitflix.repository;

import com.felipemelozx.onebitflix.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
