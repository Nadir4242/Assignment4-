//Name: Nadir Mahmood
//Student ID: 100423599
//COSC1200
//Object Oriented Programming
//Java app to display stored data and keep record of products

public class Product {

    private int sku;
    private String productName;
    private double unitCost;
    private int quantityOnHand;
    private int quantityNeeded;
    private String specialInstructions;

    // Default Constructor
    public Product() {
        // Default values
        this.sku = 0;
        this.productName = "Default Product";
        this.unitCost = 0.0;
        this.quantityOnHand = 0;
        this.quantityNeeded = 0;
        this.specialInstructions = "";
    }

    // Parameterized Constructor
    public Product(int sku, String productName, double unitCost, int quantityOnHand, int quantityNeeded, String specialInstructions) {
        this.sku = sku;
        this.productName = productName;
        this.unitCost = unitCost;
        this.quantityOnHand = quantityOnHand;
        this.quantityNeeded = quantityNeeded;
        this.specialInstructions = specialInstructions;
    }

    // Getter and Setter methods for all data members
    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Display function
    public void display() {
        System.out.println("SKU: " + sku);
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Cost: " + unitCost);
        System.out.println("Quantity on Hand: " + quantityOnHand);
        System.out.println("Quantity Needed: " + quantityNeeded);
        System.out.println("Special Instructions: " + specialInstructions);
    }
}


