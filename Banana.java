
public class Banana extends Fruits{
	//constructor
	public Banana(String color , boolean ripe) {
		super(color,ripe);
		
	}
	//Override
	@Override
	public void printRecipe() {
		System.out.println("Banan recipe: Peel the banana, ,mash it with suger");
	}
	
  
}
