package com.exam.shoppingcart.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import model.CartItem;
import repository.CartItemRepository;
import services.CartItemService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

class CartTests {

    @Mock
    private CartItemRepository cartItemRepository;

    @InjectMocks
    private CartItemService cartItemService;

    
    @Test
    public void testGetAllItems() {
	when(cartItemRepository.findAll()).thenReturn(Arrays.asList(new CartItem(1, "Burger", 2, 1000)));

        assertEquals(2, cartItemService.getCartItems().get(0).getId());
    }

}
