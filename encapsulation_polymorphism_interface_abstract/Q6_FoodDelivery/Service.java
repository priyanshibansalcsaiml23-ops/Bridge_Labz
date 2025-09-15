package q6_fooddelivery;

public class FoodService {
    public void printOrderTotal(FoodItem item) {
        item.getItemDetails();
        double subtotal = item.calculateTotalPrice();
        double discount = 0;
        if (item instanceof Discountable) {
            discount = ((Discountable) item).applyDiscount(subtotal);
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Total: " + (subtotal - discount));
    }
}
