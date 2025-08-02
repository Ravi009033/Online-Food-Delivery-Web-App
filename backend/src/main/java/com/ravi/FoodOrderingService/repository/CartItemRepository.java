package com.ravi.FoodOrderingService.repository;

import com.ravi.FoodOrderingService.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
