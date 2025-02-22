package project_1;

import java.util.*;

/**
 * * The {@code ShirtDriver} class provides a console-based menu for managing a
 * collection of {@code Shirt} objects. It allows users to:
 * <ul>
 * <li>Insert a new shirt</li>
 * <li>Display all shirts</li>
 * <li>Filter and display specific shirts based on brand, size, or price</li>
 * <li>Sort shirts based on price</li>
 * <li>List available brands and sizes</li>
 * <li>Count shirts based on brand, size, and color</li>
 * </ul>
 * This class interacts with {@code ShirtService} to manage the collection.
 * 
 * @author er-YOUR_NEW_NAME
 */

public class ShirtDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShirtDao dao = new ShirtDao();

		while (true) {
			System.out.println(
					"1.Insert Shirt\n2.Display All Shirts\n3.Blackberry Shirt Of Size 42\n4.Shirts Lesser Than Price 2500\n5.Shirts Of Size 40 And Price Greater Than 2000\n6.Sort Shirts From Low To High Price\n7.Sort Shirts From High To Low Price\n8.List All Brands\n9.List All Sizes\n10.Number of Shirts of Particular Brand\n11.Number Of Shirts of Each Brand\n12.Number Of Shirts of Each Size\n13.Number Of Shirts of Each Color");
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
			case 1: {
				System.out.println("=========================");
				dao.addShirt(addShirtsDetails(sc));
				System.out.println("=========================\n");
			}
				break;
			case 2: {
				System.out.println("=========================");
				dao.displayAllShirts();
				System.out.println("=========================\n");
			}
				break;
			case 3: {
				System.out.println("=========================");
				dao.displayBlackberryShirtOfSize42();
				System.out.println("=========================\n");
			}
				break;
			case 4: {
				System.out.println("=========================");
				dao.displayShirtsLesserThanPrice2500();
				System.out.println("=========================\n");
			}
				break;
			case 5: {
				System.out.println("=========================");
				dao.displayShirtsOfSize40AndPriceGreaterThan2000();
				System.out.println("=========================\n");
			}
				break;
			case 6: {
				System.out.println("=========================");
				dao.sortShirtsByPriceAsc();
				System.out.println("=========================\n");
			}
				break;
			case 7: {
				System.out.println("=========================");
				dao.sortShirtsByPriceDesc();
				System.out.println("=========================\n");
			}
				break;
			case 8: {
				System.out.println("=========================");
				dao.displayListOfAllBrands();
				System.out.println("=========================\n");
			}
				break;
			case 9: {
				System.out.println("=========================");
				dao.displayListOfAllSizes();
				System.out.println("=========================\n");
			}
				break;
			case 10: {
				System.out.println("=========================");
				sc.nextLine(); // Fix: Consume the leftover newline if needed
				System.out.print("Enter the Brand to count: ");
				String inputBrand = sc.nextLine();
				dao.numberOfShirtsInParticularBrand(inputBrand);
				System.out.println("=========================\n");
			}
				break;
			case 11: {
				System.out.println("=========================");
				dao.numberOfShirtsOfEachBrand();
				System.out.println("=========================\n");
			}
				break;
			case 12: {
				System.out.println("=========================");
				dao.numberOfShirtsOfEachSize();
				System.out.println("=========================\n");
			}
				break;
			case 13: {
				System.out.println("=========================");
				dao.numberOfShirtsOfEachColor();
				System.out.println("=========================\n");
			}
				break;
			default: {
				System.out.println("=========================");
				System.out.println("Invalid Input :( Try Again!");
				System.out.println("=========================\n");
			}
			}
		}
	}

	public static Shirt addShirtsDetails(Scanner scanner) {
		scanner.nextLine();
		System.out.print("Enter shirt brand: ");
		String brand = scanner.nextLine();
		System.out.print("Enter shirt price: ");
		double price = scanner.nextDouble();
		System.out.print("Enter shirt size: ");
		int size = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter shirt color: ");
		String color = scanner.nextLine();
		System.out.println();
		Shirt shirt = new Shirt(brand, price, size, color);

		return shirt;
	}
}