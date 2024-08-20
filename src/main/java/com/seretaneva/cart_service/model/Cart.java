package com.seretaneva.cart_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cart {
    private Long id;

    private Long userId;

    private List<CartItem> items = new ArrayList<>();
}
