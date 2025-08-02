package com.ravi.FoodOrderingService.repository;

import com.ravi.FoodOrderingService.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByCustomerId(Long userId);
}
