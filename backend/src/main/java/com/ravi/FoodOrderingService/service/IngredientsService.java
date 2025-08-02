package com.ravi.FoodOrderingService.service;

import com.ravi.FoodOrderingService.model.IngredientCategory;
import com.ravi.FoodOrderingService.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {

   public IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception;

   public IngredientCategory findIngredientCategoryById(Long id) throws Exception;

   public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception;

   public List<IngredientsItem> findRestaurantIngredients(Long id);

   public IngredientsItem createIngredientItem(Long restaurantId, String ingredientName, Long ingredientCategoryId) throws Exception;

   public IngredientsItem updateStock(Long id) throws Exception;
}
