package lab9_exercise2;

/**
 * TV.java
 */

/**
 * This class defines a TV item in a shop.
 * 
 * @author Stella Kazamia
 * 
 */
public class TV extends AbstractItem {

	/** Defines the percentage of the normal price used as the sale price. */
	private static final double SALE_PERCENTAGE = 0.80;


	/** Defines the size of the TV in inches. */
	private int size = 0;

	/**
	 * Constructs a TV object with an initial price and fixed size.
	 * 
	 * @param price the initial price of the item.
	 * @param size  the fixed size of the TV.
	 */
	public TV(double price, int size) {
		super(price);
		this.size = size;
	}

	/**
	 * Calculates the price at which the item should be sold in a sale.
	 * 
	 * @return the sale price.
	 * 
	 */
	@Override
	public double calculateSalePrice() {
		return super.getPrice() * SALE_PERCENTAGE;
	}

	/**
	 * @return the name of the item.
	 * 
	 */
	@Override
	public String getName() {
		return "TV (" + this.getSize() + "\")";
	}

	/**
	 * @return the current price of the item.
	 * 
	 */
	@Override
	public double getPrice() {
		return super.getPrice();
	}

	/**
	 * @return the fixed size of the TV.
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * @param price defines the new item price.
	 * 
	 */
	@Override
	public void setPrice(double price) {
		super.setPrice(price);
	}
}