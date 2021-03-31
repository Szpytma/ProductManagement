package labs.pm.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import static java.math.RoundingMode.HALF_UP;

/**
 * {@code Product} class represents properties and behaviours of
 * product objects in the Product Management System.
 * <br>
 * Each product can have a discount, calculated based on a
 * {@link #DISCOUNT_RATE discount rate}
 *
 * @author szpytma
 * @version 4.0
 */

public abstract class Product implements Rateable<Product>, Serializable {
    /**
     * A constant that defines a
     * {@link BigDecimal Bigdecimal} value of the discount rate
     * <br>
     * Discount rate is 10%
     */
    public static BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private final int id;
    private final String name;
    private final BigDecimal price;
    private final Rating rating;

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Calculates discount based on a product price and
     * {@link #DISCOUNT_RATE dicount rate}
     *
     * @return a {@link BigDecimal BigDecimal}
     * value of the discount
     */
    public BigDecimal getDiscount() {

        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);

    }

    @Override
    public Rating getRating() {
        return rating;
    }



    /**
     * Get the value of the best before date for the product
     * <p>
     * #return the value of LocalDate.now
     */
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + price + ", " + getDiscount() + ", " + rating.getStars() + ", " + getBestBefore();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // if (obj != null && getClass() == obj.getClass()) {
        if (obj instanceof Product) {
            final Product product = (Product) obj;
            return this.id == product.id; //&& Objects.equals(this.name, product.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        return hash;

    }
}
