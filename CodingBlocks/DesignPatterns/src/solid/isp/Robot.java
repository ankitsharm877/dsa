package solid.isp;

//Interface Segregation Principle (ISP): A class should not be forced to implement interfaces it does not use. 
//Instead of one large, general-purpose interface, it's better to have multiple smaller, more specific interfaces.

//Violates ISP
interface Worker {
 void work();
 void eat();
}

class Robot implements Worker {
 public void work() {
     // Robot working code
 }

 public void eat() {
     // Not applicable to robots
 }
}


//Improved: Split the interfaces into smaller, more specific ones.

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot1 implements Workable {
    public void work() {
        // Robot working code
    }
}

class HumanWorker implements Workable, Eatable {
    public void work() {
        // Human working code
    }

    public void eat() {
        // Human eating code
    }
}

