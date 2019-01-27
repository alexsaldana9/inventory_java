 /**
 * Team 1
 * @author Alexandra Saldana, Christian Insignares, Halin Haber, Jonathan Bello, Kevin Vega, Ivan Jorge
 * @version 1.0
 * COP2800: Inventory Project- com.alexsaldana.InventoryController
 * Filename:   com.alexsaldana.InventoryController.java
 *
 */

// list of products; list of users; list of deliveries, list of disposals - all of this, will be private
    // add methods (add product, add disposal)
    //get methods

import java.util.*;

public class InventoryController {

    private ArrayList products = new ArrayList();
    private ArrayList users = new ArrayList();
    private ArrayList deliveries = new ArrayList();
    private ArrayList disposals = new ArrayList();


    // declare methods to add to each list
    public void addProduct(Product product) {
        products.add(product);
    }


    public void registerDelivery(Delivery delivery) {
        deliveries.add(delivery);
    }

    public void registerDisposal(Disposal disposal) { disposals.add(disposal); }


    public ArrayList getProducts() {
        return products;
    }

    public ArrayList getUsers() {
        return users;
    }

    public ArrayList getDeliveries() { return deliveries; }

    public ArrayList getDisposals() {
        return disposals;
    }


    public void printReport() {

        System.out.println("--------------Inventory Report -------------------");

        // this for loop, goes over the array list of products.
        for (int i = 0; i < products.size(); i++)
        {
            double totalQty = 0.0;

            Product p = (Product) products.get(i);
            System.out.println("Product ID: " + p.getProductId() + " | type: " + p.getType() + " | storage: "+ p.getStorage() + " | min Amount Req: " + p.getMinAmountReq());


            for (int j = 0; j < deliveries.size(); j++)
            {
                Delivery d = (Delivery) deliveries.get(j);

                if (p.equals(d.getProduct())) {
                    System.out.println("Delivery | Product ID: " + d.getProduct().getProductId() +  " | quantity: " + d.getQuantity());

                    //System.out.println("totQty before addition => " + totalQty);
                    totalQty = totalQty + d.getQuantity();
                    //System.out.println("totQty after addition => " + totalQty);

                }

            }

            for (int k = 0; k < disposals.size(); k++)
            {
                Disposal dis = (Disposal) disposals.get(k);

                if (p.equals(dis.getProduct()))
                {
                    System.out.println("");
                    System.out.println("Disposal | Product ID: " + dis.getProduct().getProductId() + " | " + " quantity: - " + dis.getQuantity());


                    //System.out.println("totQty before subs => " + totalQty);
                    totalQty = totalQty - dis.getQuantity();
                    //System.out.println("totQty after subs => " + totalQty);

                }

            }


            if (totalQty <= (p.getMinAmountReq()))
            {
                System.out.println("WARNING: You need to order more of the Product ID: " + p.getProductId());
                System.out.println("It is below the minimum requirement. Min requirement is " + p.getMinAmountReq());
            }

            System.out.println();
            System.out.println("Total quantity in inventory: " + totalQty);

            System.out.println("------");
            System.out.println();
        }

    }

    public void entryProduct()
    {

    }

}
