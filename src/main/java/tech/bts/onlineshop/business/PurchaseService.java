package tech.bts.onlineshop.business;

import tech.bts.onlineshop.model.CartItem;
import tech.bts.onlineshop.model.ShoppingCart;

public class PurchaseService {

    /**
     * Returns the total amount of the cart
     */
    public double calculateTotalAmount(ShoppingCart cart) {

        double result = 0;

        for (CartItem item : cart.getItems()) {

            result += item.getProduct().getPrice() * item.getQuantity();
        }

        return result;
    }
}
