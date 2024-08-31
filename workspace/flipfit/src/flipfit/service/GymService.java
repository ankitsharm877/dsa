package flipfit.service;

import java.util.List;

import flipfit.dao.GymDao;
import flipfit.model.Gym;
import flipfit.model.Slot;
import flipfit.model.User;
import flipfit.model.Workout;
import flipfit.utils.Constants;

public class GymService {
	
	GymDao gymDao;
	
	public GymService() {
		this.gymDao = new GymDao();
	}
	
	public void addCenter(String name, String city, String location, double lati, double longi) {
		long id = Constants.uniqueGymId++;
		Gym gym = new Gym(id, name, city, location, lati, longi);
		this.gymDao.addGym(gym);
	}

	public void addWorkout(String centerName, String workoutName) {
		long id = Constants.uniqueworkoutId++;
		Workout workout = new Workout(id, workoutName);
		this.gymDao.addWorkout(centerName, workout);
	}
	
	public List<Workout> getAllWorkout(String centerName) {
		return this.gymDao.findAllWorkout(centerName);
	}
	
	public void addSlot(String centerName, String workoutName, String startTime, int numberOfSeats, int queueSize, boolean isPremium) {
		long id = Constants.uniqueslotId++;
		Slot slot = new Slot(id, startTime, numberOfSeats, 0, queueSize);
		slot.setPremium(isPremium);
		this.gymDao.addGymWorkoutSlot(centerName, workoutName, slot);
	}
	
	public void deleteSlot(String centerName, String workoutName, String startTime) {
		this.gymDao.deleteGymWorkoutSlot(centerName, workoutName, startTime);
	}
	
	public void addUserToSlot(String centerName, String workoutName, String startTime, User user) {
		if (user.getNumberOfSlotBooking() < Constants.maxBookingAllowedForUser) {
			this.gymDao.addUserToSlot(centerName, workoutName, startTime, user);
		} else {
			System.out.println("A Person can book a maximum of 3 slots in a day for any center.");
		}
	}
	
	public boolean checkAvailability(String centerName, String workoutName, String startTime, User user) {
		return this.gymDao.checkAvailability(centerName, workoutName, startTime, user);
	}
}
