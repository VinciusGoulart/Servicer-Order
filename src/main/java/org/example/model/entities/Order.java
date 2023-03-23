package org.example.model.entities;

import org.example.model.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orders = new ArrayList<>();

    private Client client;

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public double total() {
        double sum = 0;
        for (OrderItem o : orders) {
            sum += o.subTotal();
        }
        return sum;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void addOrderItem(OrderItem orderItem) {
        orders.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem) {
        orders.remove(orderItem);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(sdf2.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append(client).append("\n");
        for (OrderItem o : orders) {
            sb.append(o).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();

    }
}
