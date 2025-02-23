package project_1;

import java.util.*;

/**
 * DAO (Data Access Object) class is for managing a collection of shirts.
 * Provides methods to access, filter, sort, and count shirts based on different
 * criteria.
 * 
 * @author er-YOUR_NEW_NAME
 */

public class ShirtDao {
	private List<Shirt> allShirts = new ArrayList<Shirt>();
	private Set<String> allBrands = new HashSet<String>();
	private Set<Integer> allSizes = new HashSet<Integer>();

	public void addShirt(Shirt shirt) {
		allShirts.add(shirt);
		System.out.println("Shirt is Added!");
	}

	public void displayAllShirts() {
		int count = 0;
		for (Shirt x : allShirts) {
			System.out.println(x);
			count++;
		}
		System.out.println("Total Shirts are: " + count);
	}

	public void displayBlackberryShirtOfSize42() {
		int count = 0;
		for (Shirt x : allShirts) {
			if (x.getBrand().equalsIgnoreCase("Blackberry") && x.getSize() == 42) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println("Count of Blackberry shirts with size 42 is: " + count);
	}

	public void displayShirtsLesserThanPrice2500() {
		int count = 0;
		for (Shirt x : allShirts) {
			if (x.getPrice() <= 2500) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println("Count of Shirts with price lesser than 2500 is: " + count);
	}

	public void displayShirtsOfSize40AndPriceGreaterThan2000() {
		int count = 0;
		for (Shirt x : allShirts) {
			if (x.getPrice() > 2000 && x.getSize() == 40) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println("Count of Shirts with size 40 and price greater than 2000 is: " + count);
	}

	public void sortShirtsByPriceAsc() {
		List<Shirt> tempList = new ArrayList<Shirt>(allShirts);
		Collections.sort(tempList, new Comparator<Shirt>() {
			@Override
			public int compare(Shirt s1, Shirt s2) {
				return Double.compare(s1.getPrice(), s2.getPrice());
			}
		});
		int count = 0;
		for (Shirt x : tempList) {
			System.out.println(x);
			count++;
		}
		System.out.println("Total number of Shirts are: " + count);
	}

	public void sortShirtsByPriceDesc() {
		List<Shirt> tempList = new ArrayList<Shirt>(allShirts);
		Collections.sort(tempList, new Comparator<Shirt>() {
			@Override
			public int compare(Shirt s1, Shirt s2) {
				return Double.compare(s2.getPrice(), s1.getPrice());
			}
		});
		int count = tempList.size();
		for (Shirt x : tempList) {
			System.out.println(x);
		}
		System.out.println("Total number of Shirts are: " + count);
	}

	public void displayListOfAllBrands() {
		for (Shirt x : allShirts) {
			if (!allBrands.contains(x.getBrand())) {
				allBrands.add(x.getBrand());
			}
		}
		System.out.println("List of All Brands available:");
		for (String brand : allBrands) {
			System.out.println(brand);
		}
	}

	public void displayListOfAllSizes() {
		for (Shirt x : allShirts) {
			if (!allSizes.contains(x.getSize())) {
				allSizes.add(x.getSize());
			}
		}

		System.out.println("List of All Sizes available:");
		for (int size : allSizes) {
			System.out.println(size);
		}
	}

	public void numberOfShirtsInParticularBrand(String inputBrand) {
		int count = 0;

		for (Shirt x : allShirts) {
			if (x.getBrand().equalsIgnoreCase(inputBrand)) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println("Count of Shirts of " + inputBrand + " Brand is: " + count);
	}

	public void numberOfShirtsOfEachBrand() {
		Map<String, Integer> countOfBrands = new HashMap<String, Integer>();
		int count = 0;
		for (Shirt x : allShirts) {
			if (!countOfBrands.containsKey(x.getBrand())) {
				countOfBrands.put(x.getBrand(), 1);
			} else {
				countOfBrands.put(x.getBrand(), countOfBrands.get(x.getBrand()) + 1);
			}
			count++;
		}

		for (Map.Entry<String, Integer> itr : countOfBrands.entrySet()) {
			System.out.println(itr.getValue() + " shirt(s) is/are of " + itr.getKey() + " brand.");
		}
		System.out.println("Total Shirts are: " + count);
	}

	public void numberOfShirtsOfEachSize() {
		Map<Integer, Integer> countOfSize = new HashMap<Integer, Integer>();
		int count = 0;
		for (Shirt x : allShirts) {
			if (!countOfSize.containsKey(x.getSize()))
				countOfSize.put(x.getSize(), 1);
			else
				countOfSize.put(x.getSize(), countOfSize.get(x.getSize()) + 1);
		}

		Iterator<Map.Entry<Integer, Integer>> itr = countOfSize.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> mp = itr.next();
			System.out.println(mp.getValue() + " shirt(s) is/are of " + mp.getKey() + " size.");
			count++;
		}
		System.out.println("Total Shirts are: " + count);
	}

	public void numberOfShirtsOfEachColor() {
		Map<String, Integer> countOfColor = new HashMap<>();

		for (Shirt s1 : allShirts) {
			if (!countOfColor.containsKey(s1.getColor())) {
				countOfColor.put(s1.getColor(), 1);
			} else {
				countOfColor.put(s1.getColor(), countOfColor.get(s1.getColor()) + 1);
			}
		}

		for (Map.Entry<String, Integer> mp : countOfColor.entrySet()) {
			System.out.println(mp.getValue() + " shirt(s) is/are of " + mp.getKey() + " color.");
		}

		System.out.println("Total Shirts are: " + allShirts.size());
	}
}