package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.classbjunit.model.Item;

import model.CartItem;
import model.Product;
import repository.CartItemRepository;
import repository.ProductRepository;

public class CartItemServiceImplementation implements CartItemService{

    CartItemRepository cartItemRepository;
    ProductRepository productRepository;    
    
    @Autowired
    public CartItemServiceImplementation(CartItemRepository cartItemRepository, ProductRepository productRepository) {
	this.cartItemRepository = cartItemRepository;
	this.productRepository = productRepository;
    }
    
    @Override
    public List<CartItem> getCartItems() {
	
	List<Product> allProducts =  productRepository.findAll(); 
	
	for(Product product:allProducts) {
	    CartItem item = new CartItem();
	    item.setTotalPrice(product.getQuantity() * product.getPrice());
	}
	return cartItemRepository.findAll();
    }

    @Override
    public CartItem create(CartItem cartItem) {
	return cartItemRepository.save(cartItem);
    }
   
    
    public void deleteCartItem(long id)throws Exception{
        if (!cartItemRepository.existsById(id))
            throw new Exception("Cart id is invalid : " + id);
        cartItemRepository.deleteById(id);
    }   
}
