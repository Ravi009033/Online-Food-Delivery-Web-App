package com.ravi.FoodOrderingService.service;

import com.ravi.FoodOrderingService.dto.UserDTO;
import com.ravi.FoodOrderingService.model.User;

public interface UserService {

    public User registerUser(UserDTO userDTO) throws Exception;

    public User userByToken(String token) throws Exception;

    public User userByEmail(String email) throws Exception;
}
