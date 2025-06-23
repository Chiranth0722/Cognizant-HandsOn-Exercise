package packag;
import java.util.*;
class Product {
    private String name;
    private String category;
    private double price;
    public Product(String name, String category, double price) {
        this.name = name.toLowerCase();
        this.category = category.toLowerCase();
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public void displayProduct() {
        System.out.println("Name: " + name + ", Category: " + category + ", Price: ₹" + price);
    }
}
public class ECommerceSearch {
    private static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        addSampleProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search keyword (name/category): ");
        String keyword = scanner.nextLine().toLowerCase();
        List<Product> results = searchProducts(keyword);
        if (results.isEmpty()) {
            System.out.println("No products found matching your search.");
        } else {
            System.out.println("Search Results:");
            for (Product product : results) {
                product.displayProduct();
            }
        }
        scanner.close();
    }
    private static void addSampleProducts() {
        productList.add(new Product("iPhone 14", "Electronics", 79999));
        productList.add(new Product("Samsung Galaxy S21", "Electronics", 59999));
        productList.add(new Product("Nike Air Max", "Footwear", 8999));
        productList.add(new Product("Levi's Jeans", "Clothing", 1999));
        productList.add(new Product("Sony Headphones", "Electronics", 2999));
    }
    private static List<Product> searchProducts(String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(keyword) || product.getCategory().contains(keyword)) {
                results.add(product);
            }
        }
        return results;
    }
}
