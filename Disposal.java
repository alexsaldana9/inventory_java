/**
 *
 * @author Alexandra Saldana
 * @version 1.0
 * COP2800: Inventory Project- com.alexsaldana.Disposal
 * Filename:   com.alexsaldana.Disposal.java
 *
 */


public class Disposal {

    private Product product;
    private double quantity;


    public Disposal(Product product, double quantity){
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
