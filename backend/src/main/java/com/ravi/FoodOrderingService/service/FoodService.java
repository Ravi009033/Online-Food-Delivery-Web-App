package com.ravi.FoodOrderingService.service;

import com.ravi.FoodOrderingService.dto.FoodDTO;
import com.ravi.FoodOrderingService.model.Category;
import com.ravi.FoodOrderingService.model.Food;
import com.ravi.FoodOrderingService.model.Restaurant;

import java.util.List;

public interface FoodService {

   public Food createFood(FoodDTO foodDTO, Category category, Restaurant restaurant);

   boolean deleteFood(Long id) throws Exception;

   public List<Food> getAllRestaurantFoods(Long restaurantId, boolean isVegetarian, boolean isNonVeg, boolean isSeasonal, String foodCategory);

   public List<Food> searchFood(String keyword);

   public Food findFoodById(Long id) throws Exception;

   public Food updateAvailability(Long foodId) throws Exception;
}
