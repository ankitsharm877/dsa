package sap1.sap9;

import java.util.List;

public class Question {

	String str1 = "";
	String str = "Ankit";
	//str = "Ankit1";
	//IOC 
	
	// employee -> getEmp(id, name), emp
	//-> getEmp(id, name), string emp
	
	//List.of(1,2,3);
	//Set.of(1,2,3);
	//Map.of()

	public static void main(String[] args) {
		// 1. Immutable class ->  String
		// 2. Marker Interface -> serializable
		// 3. Cohesion
		// 4. Collision in HashMap
		// 5. use of serialversionUID in serializable interface
		// 6. can we set null to this keyword -> not allowed as this is keyword and assignment require veriable
		// 7. method overloading in case of different same return type
		// 8. SOLID, What is D in design pattern
		// 9. IOC in spring 
		
		String str = "Ankit";
		str = "Ankit1";
		//this = str; 
		
		List<Integer> list = List.of(1,2);
		list.add(1); // run time error UnsupportedOperationException
		System.out.println(list);
	}
	
	
	// method overloading consider only argument not return type
	public static int getEmp(int a, int b) {
		return 1;
	}
	
	public static int getEmp(int a, String b) {
		return 2;
	}
	
//	public static String getEmp(int a, String b) {
//		return "";
//	}

}
