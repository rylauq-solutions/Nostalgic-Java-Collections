package project_2;

import java.util.*;

/**
 * DAO (Data Access Object) class for managing a collection of cars. Provides
 * methods to add, display, filter, sort, and count cars based on different
 * criteria.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class CarDao {
	private List<Car> carList = new ArrayList<Car>();
	private Set<String> carBrandsSet = new HashSet<String>();

	public void addCar(Car car) {
		carList.add(car);
		System.out.println("Car is Added!");
	}

	public void displayAllCars() {
		int count = 0;
		for (Car x : carList) {
			System.out.println(x);
			count++;
		}
		System.out.println("Total Cars are: " + count);
	}

	public void displayTataCars() {
		Iterator<Car> itr = carList.iterator();
		int count = 0;
		while (itr.hasNext()) {
			Car c1 = itr.next();
			if (c1.getBrand().equalsIgnoreCase("Tata")) {
				System.out.println(c1);
				count++;
			}
		}
		System.out.println("Total Cars are: " + count);
	}

	public void displayMarutiCarsWithPriceLesserThanEqualTo800000() {
		int count = 0;
		Iterator<Car> itr = carList.iterator();
		while (itr.hasNext()) {
			Car c1 = itr.next();
			if (c1.getBrand().equalsIgnoreCase("Maruti") && c1.getPrice() <= 800000) {
				System.out.println(c1);
				count++;
			}
		}
		System.out.println("Total Cars are: " + count);
	}

	public void displayCarsWithPriceLesserThanEqualTo600000() {
		int count = 0;
		for (Car x : carList) {
			if (x.getPrice() <= 600000) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println("Total Cars are: " + count);
	}

	public void displayWhiteTataCarsOfYearMoreThanEqualTo2015() {
		int count = 0;
		for (Car x : carList) {
			if (x.getBrand().equalsIgnoreCase("Tata") && x.getMfgYear() >= 2015
					&& x.getColor().equalsIgnoreCase("White")) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println("Total Cars are: " + count);
	}

	public void sortCarsByPriceAsc() {
		List<Car> tempList = new ArrayList<Car>(carList);
		Collections.sort(tempList, new Comparator<Car>() {
			@Override
			public int compare(Car c1, Car c2) {
				return Double.compare(c1.getPrice(), c2.getPrice());
			}
		});
		int count = 0;
		for (Car x : tempList) {
			System.out.println(x);
			count++;
		}
		System.out.println("Total number of Cars are: " + count);
	}

	public void sortCarsByPriceDesc() {
		List<Car> tempList = new ArrayList<Car>(carList);
		Collections.sort(tempList, new Comparator<Car>() {
			@Override
			public int compare(Car c1, Car c2) {
				return Double.compare(c2.getPrice(), c1.getPrice());
			}
		});
		int count = 0;
		for (Car x : tempList) {
			System.out.println(x);
			count++;
		}
		System.out.println("Total number of Cars are: " + count);
	}

	public void sortCarsByMfgYearDesc() {
		List<Car> tempList = new ArrayList<Car>(carList);
		Collections.sort(tempList, new Comparator<Car>() {
			@Override
			public int compare(Car c1, Car c2) {
				return Integer.compare(c2.getMfgYear(), c1.getMfgYear());
			}
		});
		int count = 0;
		for (Car x : tempList) {
			System.out.println(x);
			count++;
		}
		System.out.println("Total number of Cars are: " + count);
	}
}
