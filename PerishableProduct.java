import java.util.Date;

public class PerishableProduct extends Product{

    private Date expiryDate;

    // Overloaded Constructor
    public PerishableProduct(int sku, String productName, double unitCost, int quantityOnHand, int quantityNeeded, String specialInstructions, Date expiryDate) {
        super(sku, productName, unitCost, quantityOnHand, quantityNeeded, specialInstructions);
        this.expiryDate = expiryDate;
    }

    // Getter and Setter method for expiry date
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Display function
    @Override
    public void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
    }

}
