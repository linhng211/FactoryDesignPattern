/**
 * A type of cake which is birthday cake
 * @author Linh Nguyen
 *
 */
public class birthdayCake extends Cake {
	/**
	 * Create a new birthday cake have indicated attributes
	 */
	public birthdayCake() {
		this.name = "Birthday Cake";
		this.price = 109.99;
		this.numLayers = 1;
		this.shape = Shape.SHEET;
		this.flavor = "Funfetti";
		this.icing = "Vanilla";
		decorations.add("Sprinkles"); 
		decorations.add("Candy Flowers"); 
		decorations.add("Icing Writing");
	}
}
