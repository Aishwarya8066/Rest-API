package com.product.Product_ManagementApi.mapper;

import com.product.Product_ManagementApi.dto.ProductDto;
import com.product.Product_ManagementApi.entity.Product;

public class ProductMapper {
    public static ProductDto maptoProductDto(Product product){
        return new ProductDto(
                product.getId(),
                product.getProductname(),
                product.getProductprice()
        );
    }

    public static Product maptoProduct(ProductDto productdto){
        return new Product(
                productdto.getId(),
                productdto.getProductname(),
                productdto.getProductprice()
        );
    }



}
