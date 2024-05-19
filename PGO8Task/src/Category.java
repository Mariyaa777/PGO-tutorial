import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Product> products;

    public Category() {
        this.name = "";
        this.products = new ArrayList();
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList();
    }

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public String toString() {
        String var10000 = this.name;
        return "Category{name='" + var10000 + "', products=" + String.valueOf(this.products) + "}";
    }
}