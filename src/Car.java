public class Car {

    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;


    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }


    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }


    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) { this.quantity = quantity; }


    public void delivery(int amount) {
        this.quantity += amount;
        System.out.println("🚚 Delivery received! " + amount + " new " + brand + " " + model + " cars added. " +
                "Now you have " + this.quantity + " in stock.");
    }


    public void sell(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
            System.out.println("💰 Sold " + amount + " " + brand + " " + model + " cars. " +
                    "Cars remaining in stock: " + this.quantity);
        } else {
            System.out.println("⚠️ Sorry, you don’t have enough cars to sell " + amount + " units.");
        }
    }


    @Override
    public String toString() {
        return "\n🚗 Car Information\n" +
                "-----------------------------\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "Color: " + color + "\n" +
                "Price: $" + price + "\n" +
                "In Stock: " + quantity + " cars\n";
    }
}