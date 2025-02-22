package project_1;

/**
 * Represents a Shirt with various attributes such as brand, price, color, and
 * size. This class provides methods to retrieve and modify the properties of a
 * shirt.
 * 
 * @author er-YOUR_NEW_NAME
 */

public class Shirt {
	private String brand;
	private double price;
	private int size;
	private String color;

	Shirt() {
	}

	Shirt(String brand) {
		this.brand = brand;
	}

	Shirt(String brand, double price) {
		this(brand);
		this.price = price;
	}

	Shirt(String brand, double price, int size) {
		this(brand, price);
		this.size = size;
	}

	Shirt(String brand, double price, int size, String color) {
		this(brand, price, size);
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "[brand: " + brand + ",\tprice: " + price + ",\nsize: " + size + ",\tcolor: " + color + "]\n";
	}

}