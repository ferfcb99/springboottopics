package com.advanced.advanced.mapper;

import com.advanced.advanced.dto.CategoryDto;
import com.advanced.advanced.entity.Category;

public class CategoryMapper {

    public Category toEntity(CategoryDto categoryDto){

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setName(categoryDto.getName());

        return category;
    }
    public CategoryDto toDto(Category category){

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());

        return categoryDto;
    }
}
