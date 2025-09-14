package q4_product;

public class ProductMain {
    public static void main(String[] args) {
        Product.updateDiscount(10.0);

        Product product1 = new Product("P001", "Laptop", 1200.00, 5);
        Product product2 = new Product("P002", "Smartphone", 800.00, 10);

        ProductService service = new ProductService();
        service.showProduct(product1);
        System.out.println();
        service.showProduct(product2);
    }
}
