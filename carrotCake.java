/**
 * A type of cake which is carrot cake
 * @author Linh Nguyen
 *
 */
public class carrotCake extends Cake {
	/**
	 * Create a new carrot cake have indicated attributes
	 */
	public carrotCake() {
		this.name = "Carrot Cake";
		this.price = 54.99;
		this.numLayers = 2;
		this.shape = Shape.ROUND;
		this.flavor = "Carrot";
		this.icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");
	}
}
