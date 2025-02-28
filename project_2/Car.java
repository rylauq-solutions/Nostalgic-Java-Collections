package project_2;

/**
 * Represents a Car with various attributes such as brand, price, color, and
 * manufacturing year. This class provides methods to set and retrieve the
 * properties of a car.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class Car {
	private String brand;
	private double price;
	private String color;
	private int mfgYear;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public int getMfgYear() {
		return mfgYear;
	}

	@Override
	public String toString() {
		return "[brand: " + brand + ",\tprice: " + price + ",\ncolor: " + color + ",\tmfgYear: " + mfgYear + "]\n";
	}

}