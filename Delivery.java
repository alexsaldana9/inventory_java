

/**
 * Team 1
 * @author Alexandra Saldana, Christian Insignares, Halin Haber, Jonathan Bello, Kevin Vega, Ivan Jorge
 * @version 1.0
 * COP2800: Inventory Project- com.alexsaldana.Delivery
 * Filename:   com.alexsaldana.Delivery.java
 *
 */


public class Delivery {

    private Product product;
    private double quantity;


    public Delivery(Product product, double quantity){
        this.product = product;
        this.quantity = quantity;
    }



    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }



    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }


}
