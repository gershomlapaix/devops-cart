package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{

}
