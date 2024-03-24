package lecture5_class_properties;

import java.math.BigDecimal;


// class (access modifier, class name, class body or scope)
class Product {
    private BigDecimal price; // variable (attribute)

    // method
    public BigDecimal getPrice() {
        return price;
    }

    // method
    public void setPrice(double value) {
        price = BigDecimal.valueOf(value);
    }
}



