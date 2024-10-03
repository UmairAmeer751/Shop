public class Product {

    private String productName;
    private String productId;
    private double price;
    private int quantity;
    private static int counter = 0;

    public Product(String productName, double price, int quantity) {
        setProductName(productName);
        this.price = price;
        this.quantity = quantity;
        this.productId = String.format("%03d", ++counter);
    }

    public Product(String productName,double price){
        this(productName,price,0);
    }

    public Product(String productName){
        this(productName,0);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = String.format("%-10s",productName);
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }


    @Override
    public String toString(){
        return productId + " " + productName + " " + price + " " + quantity;
    }
}