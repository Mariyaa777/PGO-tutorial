
public class Product {
	private String name;
	private double price;
	private String productCode;
	private int numberOfPieces;

	Product(String name, double price, String productCode){
		this.name = name;
		this.price = price;
		this.productCode = productCode;
		
		this.numberOfPieces = 0;
	}
	
	Product(String name, double price, String productCode, int numberOfPieces){
		this.name = name;
		this.price = price;
		this.productCode = productCode;
		this.numberOfPieces = numberOfPieces;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductCode() {
		return productCode;
	}

	public int getNumberOfPieces() {
		return numberOfPieces;
	}

	public void setNumberOfPieces(int numberOfPieces) throws IllegalArgumentException {
		if(numberOfPieces < 0) {
			throw new IllegalArgumentException("Number of pieces shoud not be less than 0");
		}
		
		this.numberOfPieces = numberOfPieces;
	}
	
	@Override
	 public String toString(){
	
		return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + "$" + '\'' +
                ", productCode='" + productCode + '\'' +
                ", numberOfPieces='" + numberOfPieces + '\'' + 
               '}';
	}
}
