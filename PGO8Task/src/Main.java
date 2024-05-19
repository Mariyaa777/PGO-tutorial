import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        User guest1 = new User("guest1@mail.com");
        User guest2 = new User("guest2@mail.com");
        User regularUser = new User("Сris", "Www", "Criswwh@mail.com", "QWERTY");
        System.out.println("Users:");
        System.out.println(guest1);
        System.out.println(guest2);
        System.out.println(regularUser);
        transformGuestIntoUser(guest2, "Cris", "Www", "QWERTY");
        transformGuestIntoUser(regularUser, "Cris", "Www", "QWERTY");
        System.out.println("Updated users:");
        System.out.println(guest1);
        System.out.println(guest2);
        System.out.println(regularUser);
        Product product1 = new Product("Product1", 56.0, "product_code_1");
        Product product2 = new Product("Product2", 34.0, "product_code_2", 5);
        Product product3 = new Product("Product3", 55.0, "product_code_3", 5);
        System.out.println("\nProducts:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        product3.setPrice(10.0);

        try {
            product3.setNumberOfPieces(5);
        } catch (IllegalArgumentException var15) {
            System.err.println(var15.toString());
        }

        System.out.println("Updated product3:");
        System.out.println(product3);
        new Category();
        new Category("Cars");
        List<Product> productsList = new ArrayList();
        productsList.add(product1);
        productsList.add(product2);
        new Category("Clothe", productsList);
        new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart(regularUser);
        List<Product> productsList2 = new ArrayList();
        productsList2.add(product1);
        productsList2.add(product2);
        ShoppingCart cart3 = new ShoppingCart(guest1, productsList2);
        cart2.addProduct(product3);
        cart3.addProduct(product1);
        cart3.removeProduct(product1);
        System.out.println("Total price: " + cart2.pay());
    }

    private static void transformGuestIntoUser(User guest, String name, String surname, String password) {
        try {
            guest.transformGuestIntoUser(name, surname, password);
            System.out.println("Transformed guest '" + guest.email + "' into user account");
        } catch (Exception var5) {
            System.err.println(var5.toString());
        }

    }
}