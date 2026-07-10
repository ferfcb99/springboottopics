package com.advanced.advanced.service;

import com.advanced.advanced.dto.ProductDto;
import com.advanced.advanced.entity.Category;
import com.advanced.advanced.repository.CategoryRepository;
import com.advanced.advanced.repository.ProductRepository;
import com.advanced.advanced.repository.ProductSizeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ProductService {

    private Logger log = LoggerFactory.getLogger(ProductService.class);

    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

    private ProductSizeRepository productSizeRepository;

    public ProductService(ProductRepository productRepository,
                          CategoryRepository categoryRepository,
                          ProductSizeRepository productSizeRepository) {
        this.productRepository = productRepository;
        this.productSizeRepository = productSizeRepository;
        this.categoryRepository = categoryRepository;
    }


    public ProductDto create(ProductDto productDto) {
        // registrar el product validando que tanto la categoria sea valida, como el tamanio

        Optional<Category> category = this.categoryRepository.findById(productDto.getCategoryDto().getId());

        if(category.isEmpty()){
            log.info("Categoria invalida");
            return null;
        }

        return null;
    }

}

//{
//        "id": null,
//        "name": "Camiseta Running",
//        "brand": "FitLife",
//        "price": 25.99,
//        "discount": 5,
//        "categoryDto": {
//        "id": 2,
//        "name": "Ropa De Playa"
//        },
//        "productSizeDto": {
//        "id": 2,
//        "name": "M"
//        }
//        }