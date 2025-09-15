package q2_ecommerce;

public class ECommerceMain {
    public static void main(String[] args) {
        Product p1 = new Electronics("E01", "Laptop", 50000);
        Product p2 = new Clothing("C01", "Shirt", 2000);
        Product p3 = new Groceries("G01", "Rice", 1000);

        ECommerceService service = new ECommerceService();
        service.printFinalPrice(p1);
        service.printFinalPrice(p2);
        service.printFinalPrice(p3);
    }
}
