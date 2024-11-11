package com.product.Product_ManagementApi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity //to specify class as a jpa entity
@Table(name="products")  //to specify table details // name products is a table name
public class Product
{

    @Id
    //primary key generation statergy
    @GeneratedValue(strategy = GenerationType.IDENTITY) //database Autoincrement the primary key
    private Long id;

    @Column(name="product_name") //product_name mapped with productname field
    private String productname;

    @Column(name="product_price")
    private String productprice;


}
