package com.advanced.advanced.mapper;

import com.advanced.advanced.dto.ProductSizeDto;
import com.advanced.advanced.entity.ProductSize;

public class ProductSizeMapper {

    public ProductSize toEntity(ProductSizeDto productSizeDto){
        ProductSize productSize = new ProductSize();
        productSize.setId(productSizeDto.getId());
        productSize.setName(productSizeDto.getName());

        return productSize;
    }

    public ProductSizeDto toDto(ProductSize productSize){
        ProductSizeDto productSizeDto = new ProductSizeDto();
        productSizeDto.setId(productSize.getId());
        productSizeDto.setName(productSize.getName());

        return productSizeDto;
    }

}
