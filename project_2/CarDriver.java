package project_2;

import java.util.*;

/**
 * The {@code CarDriver} class provides a console-based menu for managing a
 * collection of {@code Car} objects. It allows users to:
 * <ul>
 * <li>Insert a new car</li>
 * <li>Display all cars</li>
 * <li>Filter and display specific cars based on brand, price, or manufacturing
 * year</li>
 * <li>Sort cars based on price and manufacturing year</li>
 * <li>List available car brands</li>
 * <li>Count cars based on brand, manufacturing year, and color</li>
 * </ul>
 * This class interacts with {@code CarDao} to manage the collection.
 * 
 * @author er-YOUR_NEW_NAME
 */

public class CarDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarDao dao = new CarDao();

		while (true) {
			System.out.println(
					"1.Insert Car Details\n2.Display All Cars\n3.Display All Tata Cars\n4.Display All Maruti Cars With Price <= 800000\n5.All Cars With Price <= 600000\n6.White Tata Cars With MfgYear >= 2015\n7.Sort Cars By Price Low to High\n8.Sort Cars By Price High to Low\n9.Sort Cars By Mfg Year New to Old");
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
			case 1: {
				System.out.println("=========================");
				sc.nextLine();
				dao.addCar(addCarDetails(sc));
				System.out.println("=========================\n");
			}
				break;
			case 2: {
				System.out.println("=========================");
				dao.displayAllCars();
				System.out.println("=========================\n");
			}
				break;
			case 3: {
				System.out.println("=========================");
				dao.displayTataCars();
				System.out.println("=========================\n");
			}
				break;
			case 4: {
				System.out.println("=========================");
				dao.displayMarutiCarsWithPriceLesserThanEqualTo800000();
				System.out.println("=========================\n");
			}
				break;
			case 5: {
				System.out.println("=========================");
				dao.displayCarsWithPriceLesserThanEqualTo600000();
				System.out.println("=========================\n");
			}
				break;
			case 6: {
				System.out.println("=========================");
				dao.displayWhiteTataCarsOfYearMoreThanEqualTo2015();
				System.out.println("=========================\n");
			}
				break;
			case 7: {
				System.out.println("=========================");
				dao.sortCarsByPriceAsc();
				System.out.println("=========================\n");
			}
				break;
			case 8: {
				System.out.println("=========================");
				dao.sortCarsByPriceDesc();
				System.out.println("=========================\n");
			}
				break;
			case 9: {
				System.out.println("=========================");
				dao.sortCarsByMfgYearDesc();
				System.out.println("=========================\n");
			}
				break;

			default: {
				System.out.println("=========================");
				System.out.println("Invalid Input :( Try Again!!!");
				System.out.println("=========================\n");
			}
			}
		}
	}

	public static Car addCarDetails(Scanner scanner) {
		Car c1 = new Car();
		System.out.print("Enter Car Brand: ");
		String brand = scanner.nextLine();
		c1.setBrand(brand);

		System.out.print("Enter Price: ");
		double price = scanner.nextDouble();
		c1.setPrice(price);
		scanner.nextLine();

		System.out.print("Enter Color: ");
		String color = scanner.nextLine();
		c1.setColor(color);

		System.out.print("Enter Manufacturing Year: ");
		int mfgYear = scanner.nextInt();
		c1.setMfgYear(mfgYear);

		return c1;
	}
}