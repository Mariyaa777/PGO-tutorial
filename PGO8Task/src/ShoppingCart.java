import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    public ShoppingCart() {
        this.products = new ArrayList();
        this.user = null;
    }

    public ShoppingCart(User user) {
        this.products = new ArrayList();
        this.user = user;
    }

    public ShoppingCart(User user, List<Product> products) {
        this.products = products;
        this.user = user;
    }

    public void addProduct(Product product) {
        if (product.getNumberOfPieces() > 0) {
            this.products.add(product);
            product.setNumberOfPieces(product.getNumberOfPieces() - 1);
        } else {
            System.out.println("There is no enough product .");
        }

    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        product.setNumberOfPieces(product.getNumberOfPieces() + 1);
    }

    public double pay() {
        double totalPrice = 0.0;

        Product product;
        for(Iterator var3 = this.products.iterator(); var3.hasNext(); totalPrice += product.getPrice()) {
            product = (Product)var3.next();
        }

        return totalPrice;
    }

    public String toString() {
        String var10000 = String.valueOf(this.products);
        return "ShoppingCart{products=" + var10000 + ", user=" + String.valueOf(this.user) + "}";
    }
}