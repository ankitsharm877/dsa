package flipfit;

import flipfit.enums.USER_TYPES;
import flipfit.enums.WORKOUT;
import flipfit.model.User;
import flipfit.service.GymService;
import flipfit.service.UserService;

public class Main {

	public static void main(String[] args) {
		// multiple centers in Bangalore and can be extend to multiple city and beyond India
		// each center has n slots of an hour each 
			// -> each slot at a center can have m possible workout variations
				// -> number of seats in each workout at each time-slot for a given center is fixed(like 10 20 seats)
		
		// two types of users like 
			//FK_VIP_USER
				// -> have access to premium offerings
				// The pricing could be different for premium for any offerings vs normal users
				// A Person can book a maximum of 3 slots in a day for any center.
			
			//FK_NORMAL_USERS
				// -> don't have access to premium offerings
				// The pricing could be different for premium for any offerings vs normal users
				// A Person can book a maximum of 3 slots in a day for any center.
		
		//It should be easy to change the underlying data storage mechanism as data scale increases 
		//without changing various parts of the application

		
		UserService userService = new UserService();
		GymService gymService = new GymService();
		
		gymService.addCenter("Whitefield Center", "Bangalore", "ACES Layout, Brookefield", 10.56, 20.56);
		
		gymService.addWorkout("Whitefield Center", WORKOUT.YOGA.toString());
		gymService.addSlot("Whitefield Center", WORKOUT.YOGA.toString(), "2024-08-24 6:00AM", 10, 2, true);
		gymService.addSlot("Whitefield Center", WORKOUT.YOGA.toString(), "2024-08-24 7:00AM", 10, 2, false);
		
		gymService.addSlot("Whitefield Center", WORKOUT.YOGA.toString(), "2024-08-24 6:00PM", 10, 2, true);
		gymService.addSlot("Whitefield Center", WORKOUT.YOGA.toString(), "2024-08-24 7:00PM", 10, 2, false);
		
		gymService.addWorkout("Whitefield Center", WORKOUT.CARDIO.toString());
		gymService.addSlot("Whitefield Center", WORKOUT.CARDIO.toString(), "2024-08-24 8:00AM", 20, 5, true);
		
		gymService.addSlot("Whitefield Center", WORKOUT.CARDIO.toString(), "2024-08-24 8:00PM", 20, 5, true);
		
		gymService.addCenter("Hoodi Center", "Bangalore", "Hoodi", 15.56, 25.56);
		gymService.addWorkout("Hoodi Center", WORKOUT.WEIGHTS.toString());
		gymService.addSlot("Hoodi Center", WORKOUT.WEIGHTS.toString(), "2024-08-24 6:00AM", 50, 10, true);
		gymService.addSlot("Hoodi Center", WORKOUT.WEIGHTS.toString(), "2024-08-24 7:00AM", 50, 10, false);
		gymService.addSlot("Hoodi Center", WORKOUT.WEIGHTS.toString(), "2024-08-24 8:00AM", 50, 10, false);
		gymService.addSlot("Hoodi Center", WORKOUT.WEIGHTS.toString(), "2024-08-24 6:00PM", 50, 10, true);
		gymService.addSlot("Hoodi Center", WORKOUT.WEIGHTS.toString(), "2024-08-24 7:00PM", 50, 10, false);
		gymService.addSlot("Hoodi Center", WORKOUT.WEIGHTS.toString(), "2024-08-24 8:00AM", 50, 10, false);
		
		
		System.out.println(gymService.getAllWorkout("Whitefield Center"));
		System.out.println(gymService.getAllWorkout("Hoodi Center"));
		
		
		// Features:
			//1. Register onto the platform
		
			User normalUser = userService.register("Ankit", USER_TYPES.FK_NORMAL_USERS.toString());
			User vipUser = userService.register("Sharma", USER_TYPES.FK_VIP_USER.toString());
			System.out.println(userService.getAllUser());
		
			//2. View the workouts availability/unavailability for a particular day at a center.
			
			System.out.println(gymService.checkAvailability("Whitefield Center", WORKOUT.YOGA.toString(), "2024-08-24 6:00AM", normalUser));
			System.out.println(gymService.checkAvailability("Whitefield Center", WORKOUT.YOGA.toString(), "2024-08-24 6:00AM", vipUser));
			
		
			//3. VIP customers will have a different set of slots shown while normal customers will be 
			//shown different sets of slots. Eg: Early morning slots are dedicated only for the VIP customer.
			//In the future, VIP customers might see different pricing for the same centers.
			//(different pricing logic need not be implemented but code should be extensible for the same).
		
			//4. Book a workout for a user if seats are available in that time slot at that center
		
			//5. View his/her plan basis day as input
		
			//6. Cancel his/her workout and the slot should be accommodated by the immediate person in the queue 
			//and while filling the slot VIP customers should be given the priority. 
			//Once all the VIP customers in the queue are allocated then the normal customers are allocated.
		



	}

}
