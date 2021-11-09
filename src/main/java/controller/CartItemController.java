package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.CartItemService;

@RestController
@RequestMapping("/api/cart")
public class CartItemController {

    private final CartItemService cartItemService;

    @Autowired
    public CartItemController(final CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping
    public ResponseEntity<?> all(){
        return ResponseEntity.ok(cartItemService.getCartItems());
    }
}
