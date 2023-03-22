package org.example.model.entities;

public class OrderItem {
    Integer quantity;
    Double price;
    Product product;

    public OrderItem(){

    }
    public OrderItem(Integer quantity, Double price,Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal(){
        return  quantity * price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return getProduct().name +
                String.format(", $ %.2f", price) +
                ", quantity : " + quantity +
                String.format(", Subtotal: $ %.2f", subTotal());
    }
}
