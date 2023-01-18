package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueToList {
	 public static void main(String[] args) {
		    Queue queue = new LinkedList();
		    queue.add("Hello");
		    queue.add("World");
		    queue.add("World");
		    List list = new ArrayList(queue);

		    System.out.println(list);
		  }

		}

