
public class TestFruits {

	public static void main(String[] args) {
		//create the objects
	Mango mango = new Mango("Yellow", true);
	Banana banana = new Banana("Yellow" , true);
	
	//Call the method > print Recipe
	
	mango.printRecipe();
	mango.makeSmoothie();
	
	banana.printRecipe();
	banana.makeSmoothie();

	}

}
