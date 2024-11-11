package com.product.Product_ManagementApi.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
//we will use productdto class to transfer data between client nad server
    //we build the restservice use Productdto as reponse for rest APIs
    private Long id;
    private String productname;
    private String productprice;
}




