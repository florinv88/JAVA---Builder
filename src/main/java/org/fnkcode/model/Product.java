package org.fnkcode.model;

import java.math.BigDecimal;

public class Product {

    private int id;
    private String name;
    private BigDecimal price;
    //more attributes

    public static class Builder {
        private final Product product = new Product();

        public Builder id(int id)
        {
            product.id = id;
            return this;
        }

        public Builder name(String name)
        {
            product.name = name;
            return this;
        }
        public Builder price(BigDecimal price)
        {
            product.price = price;
            return this;
        }

        public Product build()
        {
            return product;
        }
    }

    public static Builder builder(){ //Lombok
        return new Builder();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}