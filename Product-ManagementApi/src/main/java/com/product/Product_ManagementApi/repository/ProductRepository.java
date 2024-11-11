package com.product.Product_ManagementApi.repository;

import com.product.Product_ManagementApi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;




//ProductRepository extends JPARepositiry then this ProductRepository will get crud methods
public interface ProductRepository extends JpaRepository<Product, Long>
//pass parameter typeof the ENTITY typeof PRIMARYKEy
{
}
