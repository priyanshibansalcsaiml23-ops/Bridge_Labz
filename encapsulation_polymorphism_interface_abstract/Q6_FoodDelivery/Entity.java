package q6_fooddelivery;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x" + quantity + " @ " + price);
    }
}

interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override public double applyDiscount(double amount) { return amount * 0.10; }
    @Override public String getDiscountDetails() { return "10% off"; }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; }
}
