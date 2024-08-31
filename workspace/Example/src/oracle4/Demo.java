package oracle4;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Patient> patients = new ArrayList<>();

		//You will be getting two params. 
		String patientName = null;
		String visitorName = null;

		patients.stream().filter(p -> p.getName().equals(patientName) && p.getRelations().stream().anyMatch(r -> r.getPerson().getName().equals(visitorName)));

	}
	
}

class Patient { 
	private String name;
	private List<Relation> relations;

	public String getName() {
		return  this.name;
	}
	public List<Relation> getRelations() {
		return this.relations;
	}
}


class Relation { 
	private Person person;
	
	public Person getPerson() {
		return this.person;
	}
}

class Person { 

private String name; 
public String getName() {
	return  this.name;
}

}

