package com.advanced.advanced.mapper;

import com.advanced.advanced.dto.CategoryDto;
import com.advanced.advanced.dto.ProductDto;
import com.advanced.advanced.dto.ProductSizeDto;
import com.advanced.advanced.entity.Category;
import com.advanced.advanced.entity.Product;
import com.advanced.advanced.entity.ProductSize;

public class ProductMapper {

    public static Product toEntity(ProductDto productDto){

        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setBrand(productDto.getBrand());
        product.setPrice(productDto.getPrice());
        product.setDiscount(productDto.getDiscount());


        Category category = new Category();
        category.setId(productDto.getCategoryDto().getId());
        category.setName(productDto.getCategoryDto().getName());

        ProductSize productSize = new ProductSize();
        productSize.setId(productDto.getProductSizeDto().getId());;
        productSize.setName(productDto.getProductSizeDto().getName());

        product.setCategory(category);
        product.setProductSize(productSize);

        return product;
    }

    public static ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setBrand(product.getBrand());
        productDto.setPrice(product.getPrice());
        productDto.setDiscount(product.getDiscount());

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(product.getCategory().getId());
        categoryDto.setName(product.getCategory().getName());

        ProductSizeDto productSizeDto = new ProductSizeDto();
        productSizeDto.setId(product.getProductSize().getId());
        productSizeDto.setName(product.getProductSize().getName());

        productDto.setCategoryDto(categoryDto);
        productDto.setProductSizeDto(productSizeDto);

        return productDto;
    }
}
