
public class Main {
	public static void main(String[] args) {
		createUsers();
		createProducts();
	}
	
	private static void createUsers() {
		User guest1 = new User("guest1@mail.com");
		User guest2 = new User("guest2@mail.com");

		User regularUser = new User("John", "Doe", "johnDoe@mail.com", "12345");

		System.out.println("Uers: ");
		
		System.out.println(guest1);
		System.out.println(guest2);
		System.out.println(regularUser);
		
		
		handleTransformGuestIntoUser(guest2, "Jan", "Kowalski", "12345");
		handleTransformGuestIntoUser(regularUser, "Jane", "Doe", "12345"); // Error case
		
		System.out.println(guest1);
		System.out.println(guest2);
		System.out.println(regularUser);
	}
	
	private static User handleTransformGuestIntoUser(User guest, String name, String surname, String password){
		try {
			guest.transformGuestIntoUser("Jan", "Kowalski", "12345");
			System.out.println("Transformed guest '" + guest.email + "' into user account");
		}catch(Exception e) {
			System.err.println(e.toString());
		}
		
		return guest;
	}
	
	
	private static void createProducts() {
		Product product1 = new Product("Product1", 11.5, "product_code_1");
		Product product2 = new Product("Product2", 9, "product_code_2", 3);
		Product product3 = new Product("Product3", 7.5, "product_code_3", 6);

		System.out.println("\rProducts: ");
		
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		
		
		product3.setPrice(10);
		
		try {
			product3.setNumberOfPieces(5);
		}catch(IllegalArgumentException e) {
			System.err.println(e.toString());
		}
		
		System.out.println("Updated product3:");
		System.out.println(product3);
	}

}
