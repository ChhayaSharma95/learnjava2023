package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
	 public static void main(String[] args) {
		    List myList = new ArrayList();
		    myList.add("Hello");
		    myList.add("World");
		    myList.add("World");
		    Set set = new HashSet(myList);

		    System.out.println(set);
		  }
}
