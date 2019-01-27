/**
 * Team 1
 * @author Alexandra Saldana, Christian Insignares, Halin Haber, Jonathan Bello, Kevin Vega, Ivan Jorge
 * @version 1.0
 * COP2800: Inventory Project- Main
 * Filename:   Main.java
 *
 */



import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        // Seed data into the class of Products. Create 3 instances. This refers back to the constructor in the Product class
        var productHCl = new Product(10, "acid", "acid cabinet", 400.0);
        var productSalt = new Product(20, "solid", "solid cabinet", 50.0);
        var productArgon = new Product(30, "gas", "gas tank", 330.0);


        // Seed data into the class of Delivery. Creates delivery instances for products
        var deliveryJanuary = new Delivery(productHCl,  150.00);
        var deliveryJanuary2 = new Delivery(productHCl,  200.00);
        var deliveryJanuary3 = new Delivery(productHCl,  50.00);

        var deliveryFebruary = new Delivery(productSalt,  300.00);
        var deliveryFebruary2 = new Delivery(productSalt,  400.00);
        var deliveryMarch2 = new Delivery(productSalt,  500.00);

        var deliveryJune = new Delivery(productArgon,  500.00);
        var deliveryJuly2 = new Delivery(productArgon,  200.00);


        // Seed data into the class of Disposal
        var disposalAug = new Disposal(productHCl, 50.0);
        var disposalNov = new Disposal(productSalt, 150.00);
        var disposalDec = new Disposal(productArgon, 100.00);


        // this instance contains all of the deliveries and disposals below.

        // addProduct is the method that you need to call to add to the inventory.
        var inventory = new InventoryController();
        inventory.addProduct(productHCl);
        inventory.addProduct(productSalt);
        inventory.addProduct(productArgon);

        // Delivery for Product HCl ProductID = 10.
        inventory.registerDelivery(deliveryJanuary);
        inventory.registerDelivery(deliveryJanuary2);
        inventory.registerDelivery(deliveryJanuary3);

        // Delivery for product Salt ProductID = 20.
        inventory.registerDelivery(deliveryFebruary);
        inventory.registerDelivery(deliveryFebruary2);
        inventory.registerDelivery(deliveryMarch2);

        // Delivery for Argon ProductID = 30.
        inventory.registerDelivery(deliveryJune);
        inventory.registerDelivery(deliveryJuly2);


        inventory.registerDisposal(disposalAug);
        inventory.registerDisposal(disposalNov);
        inventory.registerDisposal(disposalDec);


        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;
        while (true) {

            System.out.println("Inventory Manager: Register Product or Dispose Product:\n");
            System.out.print("1.) Add Product \n");
            System.out.print("2.) Dispose Product\n");
            System.out.print("3.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: (only enter the number): ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    int productEntry;
                    double productQtyEntry;
                    System.out.println("Choose product to add: \n");
                    System.out.print("10.) HCl \n");
                    System.out.print("20.) Salt\n");
                    System.out.print("30.) Argon\n");
                    System.out.println("Enter code for product: (only enter the number):  ");
                    productEntry = input.nextInt();

                    System.out.println("Quantity of Product: ");
                    productQtyEntry = input.nextDouble();


                    Product productSelection = productHCl;
                    if (productEntry == 10)
                    {
                        productSelection =  productHCl;

                    } else if (productEntry == 20){

                        productSelection = productSalt;

                    } else if (productEntry == 30) {

                        productSelection =  productArgon;

                    } else {

                        System.out.println("select a valid");
                    }

                    var newDelivery = new Delivery(productSelection, productQtyEntry);
                    inventory.registerDelivery(newDelivery);

                break;


                case 2:
                    int productEntryDispose;
                    double productQtyDispose;
                    System.out.println("Choose product to dispose: \n");
                    System.out.print("10.) HCl \n");
                    System.out.print("20.) Salt\n");
                    System.out.print("30.) Argon\n");
                    System.out.println("Enter code for product: ");
                    productEntryDispose = input.nextInt();

                    System.out.println("Quantity of Product: ");
                    productQtyDispose = input.nextDouble();

                    Product productSelectionDis = productHCl;
                    if (productEntryDispose == 10)
                    {
                        productSelectionDis =  productHCl;

                    } else if (productEntryDispose == 20){

                        productSelectionDis = productSalt;

                    } else if (productEntryDispose == 30) {

                        productSelectionDis =  productArgon;

                    } else {

                        System.out.println("select a valid");
                    }

                    var newDisposal = new Disposal(productSelectionDis, productQtyDispose);
                    inventory.registerDisposal(newDisposal);

                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;

            }

            // Function call, to print into the console. This function is declared in the InventoryController.java
            inventory.printReport();


        }
    }
}