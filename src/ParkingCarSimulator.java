import java.util.Scanner;
public class ParkingCarSimulator {
	
	public static void main(String[] arsg)
	{
		
		String officerName, Make, carModel, carColor, carLicense;
		int badgeNumber, minOnCar, minPurchased;
		double fine = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the officer's name");
		officerName = keyboard.nextLine();
		
		System.out.println("Enter officer's badge number");
		badgeNumber = keyboard.nextInt();
		
		System.out.println("Enter the car's make");
		Make = keyboard.nextLine();
		Make = keyboard.nextLine();
		
		System.out.println("Enter the car's model");
		carModel = keyboard.nextLine();
		
		System.out.println("Enter the car's color");
		carColor = keyboard.nextLine();
		
		System.out.println("Enter the car's liscense number");
		carLicense = keyboard.nextLine();
		
		System.out.println("Enter Minutes on car");
		minOnCar = keyboard.nextInt();
		if(minOnCar <= 0) {
			System.out.println("Invalid Entry. Please try again.");
			minOnCar = keyboard.nextInt();
		}
		
		System.out.println("Enter the number of minutes purchased on the meter");
		minPurchased = keyboard.nextInt();
		if(minPurchased <= 0) {
			System.out.println("Invalid Entry. Please try again.");
			minPurchased = keyboard.nextInt();
		}
		
		if(minOnCar > minPurchased) {
			fine = 25.0;
		}
		
		if(minPurchased < minOnCar) {
			System.out.println("Car parking time has expired. ");
			System.out.println("\nTicket data: ");
			System.out.println("\nMake: " + Make);
			System.out.println("\nModel: " + carModel);
			System.out.println("\nColor: " + carColor);
			System.out.println("\nLiscense Number: " + carLicense);
			System.out.println("\nOfficer Name: " + officerName);
			System.out.println("\nBadge Number: " + badgeNumber);
			System.out.println("\nFine: " + fine);
			
		} else {
			System.out.println("The car parking minutes are valid");
		}
		
	}

}