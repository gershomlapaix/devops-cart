package services;

import java.util.List;

import model.CartItem;

public interface CartItemService {
    
    public List<CartItem> getCartItems();
    
    public CartItem create(CartItem cartItem);
    
    public void deleteCartItem(long id) throws Exception;
}
