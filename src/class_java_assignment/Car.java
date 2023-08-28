package class_java_assignment;

import java.util.Scanner;

public class Car {
	String carModel, carName, carOwner;
	double carPrice;
	
	
	public Car(String carModel, String carName, double carPrice, String carOwner) {
		super();
		this.carModel = carModel;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carOwner = carOwner;
		
		}
	
	public void display() {
		System.out.println("-----------------------");
		System.out.println("User Car Information");
		System.out.println("Car Model: "+carModel);
		System.out.println("Car Name: "+carName);
		System.out.println("Car Price: "+carPrice);
		System.out.println("Car Owner: "+carOwner);
		System.out.println("-----------------------");
		
	}
	
	public static class Runner {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String userModel;
            String userCarName;
            double userCarPrice;
            String userName;

            Car[] cars = new Car[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter Car Model: ");
                userModel = in.nextLine();
                System.out.println("Enter Car Name: ");
                userCarName = in.nextLine();
                System.out.println("Enter Car Price: ");
                userCarPrice = in.nextDouble();
                in.nextLine(); 
                System.out.println("Enter Car Owner: ");
                userName = in.nextLine();

                cars[i] = new Car(userModel, userCarName, userCarPrice, userName);
            }

            in.close();

            System.out.println("Car Data:");
            for (Car car : cars) {
                car.display();
		}
	
}
 
}
}



