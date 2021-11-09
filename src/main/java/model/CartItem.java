package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class CartItem {
    @Id    
    private Long id;
    
    private Product product;
    
    @Transient
    private double totalPrice;
    
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public CartItem(Long id, Product product, double totalPrice) {
	super();
	this.id = id;
	this.product = product;
	this.totalPrice = totalPrice;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CartItem() {
	// TODO Auto-generated constructor stub
    }       
    
}
