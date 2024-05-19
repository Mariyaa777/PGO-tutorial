public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;

    Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public int getNumberOfPieces() {
        return this.numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) throws IllegalArgumentException {
        if (numberOfPieces < 0) {
            throw new IllegalArgumentException("Number of pieces shoud not be less than 0");
        } else {
            this.numberOfPieces = numberOfPieces;
        }
    }

    public String toString() {
        return "Product{name='" + this.name + "', price='" + this.price + "$', productCode='" + this.productCode + "', numberOfPieces='" + this.numberOfPieces + "'}";
    }
}