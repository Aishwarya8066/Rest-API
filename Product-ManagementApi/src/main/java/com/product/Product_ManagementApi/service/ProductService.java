package com.product.Product_ManagementApi.service;

import com.product.Product_ManagementApi.dto.ProductDto;

import java.util.List;

public interface ProductService {

    //lets define method ProductDto
    ProductDto createProduct(ProductDto productdto);


    //get record by id
    ProductDto getProductById(Long productId);

    //get all
    List<ProductDto> getAllProducts();

    //update
    ProductDto updateProduct(Long productId, ProductDto updatedproduct);

    void deleteProduct(Long productId);



}
