package org.fnkcode;

import org.fnkcode.model.Product;
import org.fnkcode.model.User;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product.Builder()
                .id(1)
                .name("Apple")
                .price(BigDecimal.valueOf(99.99))
                .build();

        Product product2 = Product.builder()
                .id(2)
                .name("Car")
                .price(BigDecimal.valueOf(9999.99))
                .build();

        User user = User.builder()
                .id(1)
                .name("Florin")
                .build();

        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
