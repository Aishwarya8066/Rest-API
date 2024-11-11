package com.product.Product_ManagementApi.controller;

import com.product.Product_ManagementApi.dto.ProductDto;
import com.product.Product_ManagementApi.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     // this class becomes spring mvc rest controller capable to handel htttp
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    // lets first iject the dependecies
    private ProductService productService;

    //Build Add productREST API
    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){
        ProductDto savedProduct =productService.createProduct(productDto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<ProductDto>getProductById(@PathVariable("id")Long productId)
    {
        ProductDto productDto = productService.getProductById((productId));
        return ResponseEntity.ok(productDto) ;
    }

    //get all products
    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProduts(){
        List<ProductDto>products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
@PutMapping("{id}")
    public  ResponseEntity<ProductDto>updateProduct(@PathVariable("id")Long productId,
                                                    @RequestBody ProductDto updateProduct){
        ProductDto productDto=productService.updateProduct(productId,updateProduct);
        return ResponseEntity.ok(productDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteProduct(@PathVariable("id") Long productId){
        productService.deleteProduct(productId);
        return ResponseEntity.ok("Product deleted successfully!");
    }
}
