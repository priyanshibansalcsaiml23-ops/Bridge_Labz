package q2_ecommerce;

public class ECommerceService {
    public void printFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0;
        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }
        double finalPrice = product.getPrice() + tax - discount;
        System.out.println(product.getName() + " Final Price: " + finalPrice);
    }
}
