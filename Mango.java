
public class Mango extends Fruits {
	//constructor
	public Mango(String color, boolean ripe) {
		super(color, ripe);
	}
//Override 
	
	@Override 
	public void printRecipe() {
		System.out.println("Mango recipe: Cut the mango, belnd with milk.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
