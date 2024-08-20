package com.seretaneva.cart_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    private Long id;

    private Cart cart;

    private Long productId;

    private int quantity;

    private Double priceAtPurchase;
}
