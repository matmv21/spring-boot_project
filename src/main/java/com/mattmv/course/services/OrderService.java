package com.mattmv.course.services;

import com.mattmv.course.entities.Order;
import com.mattmv.course.entities.User;
import com.mattmv.course.repositories.OrderRepository;
import com.mattmv.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService { // bussiness rules engine (BRE)

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
