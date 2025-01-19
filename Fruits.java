//create abstract class 

	public abstract class Fruits{
		private String color;
		private boolean ripe;
	//constructor 	
   public Fruits(String color , boolean ripe) {
	   this.color = color;
	   this.ripe = ripe;
   }
   //Getter method for the attributes
   
   public String getColor() {
	   return color;
   }
   public boolean getripe() {
	   return ripe;
   }
   //Add abstract method 
   public abstract void printRecipe();
   
   //Add concrete method to print the messages 
   
   public void makeSmoothie() {
	   System.out.println("Make smoothie with this fruits");
   }
  
   //create subclasses in another files
   

	public static void main(String[] args) {
		

	}

}
