package Operators;

public class StatementIntoOne {
	class Animal {
		  public Animal(String aType) {
		    type = aType;
		  }
		  public String toString() {
		    return "This is a " + type;
		  }
		  private String type;
		}
		public class MainClass {
		  public void main(String[] a) {
		    System.out.println(new Animal("a").getClass().getName()); // Output the
		                                                              // class name
		  }
		}
}
