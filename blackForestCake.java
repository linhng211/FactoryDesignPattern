/**
 * A type of cake which is black forest cake
 * @author Linh Nguyen
 *
 */
public class blackForestCake extends Cake {		
	/**
	 * Create a new black forest cake have indicated attributes
	 */
	public blackForestCake() {
		this.name = "Black Forest Cake";
		this.price = 47.99;
		this.numLayers = 3;
		this.shape = Shape.ROUND;
		this.flavor = "Black Forest";
		this.icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}
}
