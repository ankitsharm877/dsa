package solid.srp;


// Single Responsibility Principle : A class should have only one reason to change, meaning it should have only one job or responsibility

//Violates SRP
class User {
	 private String name;
	 private String email;
	
	 // Constructor, getters, and setters
	
	 public void saveToDatabase() {
	     // Code to save user data to a database
	 }
	
	 public void sendEmail() {
	     // Code to send an email
	 }
}


//Improved: Separate the responsibilities into different classes.

class User1 {
    private String name;
    private String email;

    // Constructor, getters, and setters
}

class UserRepository {
    public void save(User user) {
        // Code to save user data to a database
    }
}

class EmailService {
    public void sendEmail(User user) {
        // Code to send an email
    }
}




