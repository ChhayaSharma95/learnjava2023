package Cast;

public class ClassConstructor {
	 public static void main(String[] argv) {

		    String sValue = "5";

		    try {
		      int iValue =Integer.valueOf(sValue).intValue();
		    } catch (NumberFormatException ex) {
		      ex.printStackTrace();
		    }
		  }
		
}
