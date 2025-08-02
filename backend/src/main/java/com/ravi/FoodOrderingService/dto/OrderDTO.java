package com.ravi.FoodOrderingService.dto;

import com.ravi.FoodOrderingService.model.Address;
import lombok.Data;

@Data
public class OrderDTO {

    private Long restaurantId;
    private Address deliveryAddress;

}
