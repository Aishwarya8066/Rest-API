package com.product.Product_ManagementApi.service.impl;

import com.product.Product_ManagementApi.dto.ProductDto;
import com.product.Product_ManagementApi.entity.Product;
import com.product.Product_ManagementApi.exception.ResourceNotFounException;
import com.product.Product_ManagementApi.mapper.ProductMapper;
import com.product.Product_ManagementApi.repository.ProductRepository;
import com.product.Product_ManagementApi.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

   private ProductRepository productRepository;
    @Override
    public ProductDto createProduct(ProductDto productdto) {

       //Productdto into product jpa
        //we need to store product entity into database
        Product product= ProductMapper.maptoProduct(productdto);
        Product savedProduct= productRepository.save(product);           //save JPAE entity into database; her we use save method and pass product obj
        return ProductMapper.maptoProductDto(savedProduct);        //savedProdect is local variable return to the
    }

    @Override
    public ProductDto getProductById(Long productId) {
      Product product=  productRepository.findById(productId)
        .orElseThrow(()->new ResourceNotFounException("Product is not exists  with given id:  "+productId));

        return ProductMapper.maptoProductDto(product);
    }



    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map((product)->ProductMapper.maptoProductDto(product)).collect(Collectors.toList());


    }

    @Override
    public ProductDto updateProduct(Long productId, ProductDto updatedproduct) {
        Product product = productRepository.findById(productId).orElseThrow(()->new ResourceNotFounException(("Prouct is not exsits with given id : "+productId)));
        product.setProductname((updatedproduct.getProductname()));
        product.setProductprice((updatedproduct.getProductprice()));
        Product updatedProductObj = productRepository.save(product);
        return ProductMapper.maptoProductDto(updatedProductObj);
    }

    @Override
    public void deleteProduct(Long productId) {
        Product product=productRepository.findById(productId).orElseThrow(()-> new ResourceNotFounException("Product is not exists with given id: "+productId));
        productRepository.deleteById(productId);
    }
}
