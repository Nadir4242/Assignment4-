import java.util.ArrayList;
import java.util.Date;

public class ProductManager {
    public static void main(String[] args) {
        // Create multiple Products
        Product product1 = new Product(101, "Apples", 10.5, 50, 20, "Handle with care");
        Product product2 = new Product(102, "Violin", 15.75, 30, 15, "Fragile");
        Product product3 = new Product(103, "Paint Box", 5.0, 100, 30, "Keep away from heat");

        // Create multiple Perishable Products
        PerishableProduct perishableProduct1 = new PerishableProduct(201, "Milk", 8.99, 25, 10, "Refrigerate", new Date());
        PerishableProduct perishableProduct2 = new PerishableProduct(202, "Cheese", 12.5, 15, 8, "Use before expiration", new Date());

        // Put all products in an ArrayList
        ArrayList<Product> productsList = new ArrayList<>();
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(perishableProduct1);
        productsList.add(perishableProduct2);

        // Display details of all products
        for (Product product : productsList) {
            product.display();
            System.out.println("------------------------------");
        }
    }
}
