
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Car Management System! 🚘");
        System.out.println("Let's add a new car to your inventory.\n");

        System.out.print("Enter car brand: ");
        String brand = input.nextLine();

        System.out.print("Enter car model: ");
        String model = input.nextLine();

        System.out.print("Enter year of production: ");
        int year = input.nextInt();

        System.out.print("Enter car price: ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.print("Enter car color: ");
        String color = input.nextLine();

        System.out.print("Enter how many cars are in stock: ");
        int quantity = input.nextInt();


        Car car = new Car(model, brand, year, price, color, quantity);


        System.out.println(car.toString());


        System.out.print("How many cars did you sell today? ");
        int sold = input.nextInt();
        car.sell(sold);


        System.out.print("How many new cars were delivered? ");
        int delivered = input.nextInt();
        car.delivery(delivered);


        System.out.println("\n📊 Updated car info:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Quantity: " + car.getQuantity());


        input.nextLine();
        System.out.println("\nWould you like to update the car color or price? (yes/no)");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("Enter new color: ");
            String newColor = input.nextLine();
            car.setColor(newColor);

            System.out.print("Enter new price: ");
            double newPrice = input.nextDouble();
            car.setPrice(newPrice);
        }


        System.out.println("\n✨ Final car details after updates:");
        System.out.println(car.toString());

        System.out.println("Thank you for using the Car Management System! 👋");
        input.close();
    }
}
