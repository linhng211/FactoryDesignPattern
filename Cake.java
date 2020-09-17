import java.util.ArrayList;
/**
 * A Cake in the factory
 * @author Linh Nguyen
 *
 */
public class Cake {
	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;
	/**
	 * The constructor create the ArrayList of decorations
	 */
	public Cake() {	
		decorations = new ArrayList<String>();
	}
	/**
	 * Call the attributes of the cakes
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	/**
	 * Display the message depends on the cake's flavor and shapes
	 */
	private void createLayers() {
		if(shape == shape.CUPCAKES) {
			System.out.println("Creating a " + flavor + " cupcakes");
		}
		else if(shape == shape.BUNT) {
			System.out.println("Creating a " + flavor + " bunt cake");
		}
		else if(numLayers == 1 || shape == shape.SHEET) {
			System.out.println("Creating a 1 layer " + Shape.SHEET.toString().toLowerCase() + " " + flavor + " cake.");
		}
		else {
			System.out.println("Creating " + numLayers + " layered " + Shape.ROUND.toString().toLowerCase() + " " + flavor + " cake.");
		}
	}
	/**
	 * Display the the frost cake icing information depend on the type of cake
	 */
	private void frostCake() {
		System.out.println("Frost cake with " + icing + " icing.");
	}
	/**
	 * Loop through the ArrayList and display the decorations added depends on the type of cake
	 */
	private void addDecorations() {
		for (int i=0; i<decorations.size(); i++) {
		    System.out.println("Adding " + decorations.get(i));
		}
	}
	/**
	 * Get the corresponding price of the cake
	 * @return a double which is the price of cake 
	 */
	public double getPrice() {
		return price;
	}
}
