/**
 * Team 1
 * @author Alexandra Saldana, Christian Insignares, Halin Haber, Jonathan Bello, Kevin Vega, Ivan Jorge
 * @version 1.0
 * COP2800: Inventory Project- com.alexsaldana.Product
 * Filename:   com.alexsaldana.Product.java
 *
 */


public class Product {

    private int productId;
    private String type;
    private String storage;
    private double minAmountReq;


    // Constructor
    public Product(int productId, String type, String storage, double minAmountReq){
        this.productId = productId;
        this.type = type;
        this.storage = storage;
        this.minAmountReq = minAmountReq;
    }


    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMinAmountReq(double minAmountReq) {
        this.minAmountReq = minAmountReq;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }



    public int getProductId() {
        return productId;
    }

    public String getType() {
        return type;
    }

    public String getStorage() {
        return storage;
    }

    public double getMinAmountReq() {
        return minAmountReq;
    }


}
