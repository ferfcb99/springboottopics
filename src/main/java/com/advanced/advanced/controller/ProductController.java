package com.advanced.advanced.controller;

import com.advanced.advanced.dto.ProductDto;
import com.advanced.advanced.payload.ResponseAPI;
import com.advanced.advanced.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseAPI<ProductDto>> createProduct(@RequestBody ProductDto productDto) {
        logger.info("Mi objeto : {}", productDto);
        ProductDto productDtoSaved = this.productService.create(productDto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ResponseAPI<>("200", "Todo bien", productDtoSaved));
    }

}
