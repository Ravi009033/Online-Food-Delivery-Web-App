package com.ravi.FoodOrderingService.service;

import com.ravi.FoodOrderingService.dto.RestaurantDTO;
import com.ravi.FoodOrderingService.model.Restaurant;
import com.ravi.FoodOrderingService.model.User;

import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(Restaurant restaurant, User user);

    public Restaurant updateRestaurant(Long id, Restaurant restaurant);

    public Boolean deleteRestaurant(Long id);

    public List<Restaurant> getAllRestaurant();

    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant updateStatus(Long id);

    public Restaurant findById(Long id);

    public RestaurantDTO addToFavorites(Long restaurantId, User user);

    public List<Restaurant> findRestaurantByOwnerId(Long id);
}
