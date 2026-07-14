package com.advanced.advanced.mapper;

import com.advanced.advanced.dto.CategoryDto;
import com.advanced.advanced.dto.ProductDto;
import com.advanced.advanced.dto.ProductSizeDto;
import com.advanced.advanced.entity.Category;
import com.advanced.advanced.entity.Product;
import com.advanced.advanced.entity.ProductSize;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    public static Product toEntity(ProductDto productDto){

        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setBrand(productDto.getBrand());
        product.setPrice(productDto.getPrice());
        product.setDiscount(productDto.getDiscount());
        product.setQuantityAvailable(productDto.getQuantityAvailable());


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
        productDto.setQuantityAvailable(product.getQuantityAvailable());

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
    public static List<ProductDto> toListDto(List<Product> products){
        List<ProductDto> productDtoList = new ArrayList<>();

        for (Product product: products){
            productDtoList.add(toDto(product));
        }
        return productDtoList;

    }

    public static List<Product> toListEntity(List<ProductDto> productDtos){
        List<Product> products = new ArrayList<>();

        for (ProductDto productDto: productDtos){
            products.add(toEntity(productDto));
        }
        return products;
    }
}
