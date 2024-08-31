package list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		Vector<Integer> v1 = new Vector<>(10);
		Vector<Integer> v2 = new Vector<>(10, 2);
		Vector<Integer> v3 = new Vector<>(vector);
		
		vector.addElement(1);
		vector.removeElement(1);
		vector.removeElementAt(1);
		vector.removeAllElements();
		
		vector.elementAt(0);
		vector.firstElement();
		vector.lastElement();
		
		Enumeration<Integer> en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
