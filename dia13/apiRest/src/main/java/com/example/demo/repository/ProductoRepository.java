package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Producto;

@Repository
public interface ProductoRepository extends MongoRepository <Producto, String> {

}
