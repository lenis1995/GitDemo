package collections;

import java.util.ArrayList;

public class arrayListExample {

	// can accept duplicate values
	//ArraList,LinkedList,vector- Implementing List
	// interface
	//array have fixed size where as arraylist can grow dynamicaly
	// //you can access and insert any value in any index 
	
	public static void main(String[] args) { // TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();

		a.add("lens");
		a.add("java");
		a.add("java");
		a.add("Ejemplo git 1");
		a.add("Ejemplo git 2");
		a.add("Ejemplo git 3");
		a.add("Ejemplo git 4");
		a.add("Ejemplo git 5");
		a.add("Ejemplo git 6");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/* a.remove(1);
		 *  a.remove("java");
		 *   System.out.println(a); */
		System.out.println(a.get(2));
		// testing System.out.println(a.contains("java"));
		System.out.println(a.indexOf("lens"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

	protected void abc() {

		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
