package com.felipemelozx.onebitflix.service;

import com.felipemelozx.onebitflix.entity.Category;
import com.felipemelozx.onebitflix.repository.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

  private final CategoryRepository categoryRepository;

  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public Page<Category> findAll(Integer page, Integer perPage) {
    Pageable pageable = PageRequest.of(page, perPage, Sort.by(Sort.Order.asc("position")));
    return categoryRepository.findAll(pageable);
  }
}
