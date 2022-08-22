package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson02StreamFilter {

    public static void main(String[] args) {

        System.out.println("****** Using Traditional Way *******");
        // Filter in traditional way
        List<Product> list = new ArrayList<>();
        for (Product product : getProducts()) {
            if (product.getPrice() > 25000)
                list.add(product);
        }
        for (Product product : list) {
            System.out.println(product);
        }

        System.out.println("****** Using Stream API *******");
        // Using Stream API
        List<Product> productList = getProducts()
                .stream()
                .filter(product -> product.getPrice() > 25000)
                .collect(Collectors.toList());
        productList.forEach(System.out::println);

        System.out.println("****** Using Stream API Another way *******");
        getProducts()
                .stream()
                .filter(product -> product.getPrice() > 25000)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static List<Product> getProducts() {

        var products = new ArrayList<Product>();
        products.add(new Product(1, "HP Laptop", 25000f));
        products.add(new Product(1, "DELL Laptop", 30000f));
        products.add(new Product(1, "Lenovo Laptop", 28000f));
        products.add(new Product(1, "Sony Laptop", 28000f));
        products.add(new Product(1, "Apple Laptop", 90000f));
        return products;
    }
}

class Product {

    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
