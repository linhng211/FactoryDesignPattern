/**
 * This class represent for the factory which responsible for create cake and take order
 * @author Linh Nguyen
 *
 */
public class Bakery {
	/**
	 * Create a correct new cake based on the String "type"
	 * @param type The type of cake 
	 * @return the new cake depends on the type of it
	 */
	private Cake createCake(String type) {
		if (type.equals("carrot cake")) {
			return new carrotCake();
		} 
		else if (type.equals("black forest cake")) {
			return new blackForestCake();
		}
		else {
			return new birthdayCake();
		}
	}
	/**
	 * make an order depend on the type of the cake, show the cake details and its price
	 * @param type The type of cake
	 * @return the attributes of the cake and its price base on the type of cake  
	 */
	public Cake orderCake(String type) { 	
		Cake cake = createCake(type);
		cake.createCake();
		System.out.println("Price: $" + cake.getPrice());
		return cake;
	}
}
