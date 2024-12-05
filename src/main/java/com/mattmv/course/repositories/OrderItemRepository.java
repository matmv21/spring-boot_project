package com.mattmv.course.repositories;

import com.mattmv.course.entities.OrderItem;
import com.mattmv.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
