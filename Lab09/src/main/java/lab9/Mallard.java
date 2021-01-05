package lab9;

/**
 * Mallard.java
 */

/**
 * This class defines a generic mallard duck.
 * 
 * @author Stella Kazamia
 * 
 */
public class Mallard extends Duck {

	public Mallard() {
		this("No name");
	}

	/**
	 * Constructor requiring the animal's name.
	 * 
	 * @param name the name of the animal.
	 */
	public Mallard(String name) {
		super(name);
		System.out.println("In Mallard constructor");
		
	}

	@Override
	public String getName() {
		return super.getName() + " is my mallard name";
	}
}
