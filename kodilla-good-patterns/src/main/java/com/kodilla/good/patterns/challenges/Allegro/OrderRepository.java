package com.kodilla.good.patterns.challenges.Allegro;

public class OrderRepository {

    public boolean createOrder(BuyNow buyNow) {
        System.out.println("Ordered for: " + buyNow.getUser().getName() + " " + buyNow.getUser().getSurname()
                + " thing: " + buyNow.getThing() + " price: " + buyNow.getPrice());
        return true;
    }
}
