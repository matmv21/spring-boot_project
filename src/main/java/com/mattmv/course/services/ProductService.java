package com.mattmv.course.services;

import com.mattmv.course.entities.Product;
import com.mattmv.course.entities.User;
import com.mattmv.course.repositories.ProductRepository;
import com.mattmv.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService { // bussiness rules engine (BRE)

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
