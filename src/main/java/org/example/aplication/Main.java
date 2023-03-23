package org.example.aplication;

import org.example.model.entities.Client;
import org.example.model.entities.Order;
import org.example.model.entities.OrderItem;
import org.example.model.entities.Product;
import org.example.model.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date(DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client c1 = new Client(name, email, birthDate);

        System.out.println();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), orderStatus, c1);
        System.out.print("How many items to this order: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + ":");
            System.out.print("Product name: ");
            String pName = sc.next();
            System.out.print("Product Price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer qtd = sc.nextInt();

            Product product = new Product(pName, price);
            OrderItem orderItem = new OrderItem(qtd, price, product);
            order.addOrderItem(orderItem);
        }
        System.out.println();
        System.out.println(order);


    }
}