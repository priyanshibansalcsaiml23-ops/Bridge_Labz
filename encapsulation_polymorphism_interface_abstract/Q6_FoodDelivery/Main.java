package q6_fooddelivery;

public class FoodMain {
    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 180, 2);
        FoodItem nonveg = new NonVegItem("Chicken Biryani", 220, 1);

        FoodService svc = new FoodService();
        svc.printOrderTotal(veg);
        System.out.println();
        svc.printOrderTotal(nonveg);
    }
}
