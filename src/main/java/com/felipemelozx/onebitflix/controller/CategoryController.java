package com.felipemelozx.onebitflix.controller;


import com.felipemelozx.onebitflix.dto.CategoryPageDTO;
import com.felipemelozx.onebitflix.dto.CategoryDTO;
import com.felipemelozx.onebitflix.entity.Category;
import com.felipemelozx.onebitflix.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categories")
public class CategoryController {

  private final CategoryService categoryService;

  public CategoryController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @GetMapping
  public ResponseEntity<CategoryPageDTO> getAllCategories(@RequestParam(defaultValue = "1") int page,
                                                         @RequestParam(defaultValue = "10") int perPage){

    if(page - 1 < 0 ){
      return ResponseEntity.badRequest().build();
    }

    Page<Category> categoryList = categoryService.findAll(page - 1, perPage);

    List<CategoryDTO> categories = categoryList.getContent().stream()
        .map(category ->
            new CategoryDTO(category.getId(),category.getName(), category.getPosition())).toList();

    return ResponseEntity.ok(new CategoryPageDTO(categories,
                                                 categoryList.getPageable().getPageNumber() + 1,
                                                 categoryList.getSize(),
                                                 categoryList.getTotalElements()));
  }
}
