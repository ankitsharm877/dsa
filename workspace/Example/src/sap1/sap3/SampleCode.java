package sap1.sap3;

import java.util.Set;
import java.util.TreeSet;

public class SampleCode {

	public static void main(String[] args) {
		 
		Set<Vehicle> vehicleSet = new TreeSet<>((a, b) -> a.name.compareTo(b.name));
		vehicleSet.add(new Vehicle("Car", 4)); 
		vehicleSet.add(new Vehicle("Truck", 6));
		vehicleSet.add(new Vehicle("Truck", 6));
		vehicleSet.add(new Vehicle("Truck", 8));
		System.out.println(vehicleSet.size()); // 2
		//System.out.println(vehicleSet.get(new Vehicle("Truck", 3))); // 8
	}
}

class Vehicle{
	String name;
	int noOfWheels;
	public Vehicle(String name, int noOfWheels){
		this.name = name;
		this.noOfWheels = noOfWheels;
	}
	public String getName(){
		return this.name;
	}
	public boolean equal(Vehicle v) {
		if (this.name.equals(v.name)) {
			return true;
		}
		return false;
	}
	public int hashCode(Vehicle v) {
		return v.name.hashCode();
	}
}
