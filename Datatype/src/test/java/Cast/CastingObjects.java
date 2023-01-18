package Cast;

public class CastingObjects {
	public String toString() {
	    return "This is an animal ";
	  }
	}
	class Dog extends CastingObjects {
	  public void sound() {
	    System.out.println("Woof Woof");
	  }
	}
	class Cat extends CastingObjects {
	  public Cat(String aName) {
	    name = aName;
	  }
	  public String toString() {
	    return super.toString() + "\nIt's " + name + " the " + breed;
	  }
	  public void sound() {
	    System.out.println("Miiaooww");
	  }
	  private String name;
	  private String breed;
	//}
	//public class MainClass {
	  public static void main(String[] a) {
	    Cat aPet = new Cat("Fang");
	    CastingObjects theAnimal = (CastingObjects) aPet; 
	  }
	}

