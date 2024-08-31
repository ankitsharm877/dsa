package flipfit.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import flipfit.enums.USER_TYPES;
import flipfit.model.Gym;
import flipfit.model.Slot;
import flipfit.model.User;
import flipfit.model.Workout;

public class GymDao {
	
	private List<Gym> gyms;
	
	public GymDao() {
		this.gyms = new ArrayList<>();
	}

	public void addGym(Gym gym) {
		this.gyms.add(gym);
	}
	
	public Optional<Gym> findGym(String centerName) {
		return this.gyms.stream().filter(gym -> gym.getName().equals(centerName)).findFirst();
	}
	
	public List<Workout> findAllWorkout(String centerName) {
		Optional<Gym> gymOpt = findGym(centerName);
		if (gymOpt.isPresent()) {
			Gym gym = gymOpt.get();
			return gym.getWorkouts();
		} else {
			return List.of();
		}
	}

	public Optional<Workout> findGymWorkout(String centerName, String workoutName) {
		Optional<Gym> gymOpt = findGym(centerName);
		if (gymOpt.isPresent()) {
			Gym gym = gymOpt.get();
			return gym.getWorkouts().stream().filter(workout -> workout.getName().equals(workoutName)).findFirst();
		} else {
			return Optional.empty();
		}
	}
	
	public void addWorkout(String centerName, Workout workout) {
		Optional<Gym> gymOpt = findGym(centerName);
		if (gymOpt.isPresent()) {
			Gym gym = gymOpt.get();
			gym.getWorkouts().add(workout);
		}
	}
	
	public boolean addGymWorkoutSlot(String centerName, String workoutName, Slot slot) {
		Optional<Workout> workoutOpt = findGymWorkout(centerName, workoutName);
		if (workoutOpt.isPresent()) {
			Workout workout = workoutOpt.get();
			return workout.getSlots().add(slot);
		}
		return false;
	}
	
	public boolean deleteGymWorkoutSlot(String centerName, String workoutName, String startTime) {
		Optional<Workout> workoutOpt = findGymWorkout(centerName, workoutName);
		if (workoutOpt.isPresent()) {
			Workout workout = workoutOpt.get();
			
			return workout.getSlots().removeIf(slot -> slot.getStartTime().equals(startTime));
		}
		return false;
	}
	
	public boolean addUserToSlot(String centerName, String workoutName, String startTime, User user) {
		Optional<Workout> workoutOpt = findGymWorkout(centerName, workoutName);
		if (workoutOpt.isPresent()) {
			Workout workout = workoutOpt.get();
			Optional<Slot> slotOpt = workout.getSlots().stream().filter(slot -> slot.getStartTime().equals(startTime)).findFirst();
			if (slotOpt.isPresent()) {
				Slot slot = slotOpt.get();
				if (slot.getNumberOfBooking() < slot.getNumberOfSeats()) {
					
				} else {
					
				}
			}
		}
		return false;
	}
	

	public boolean checkAvailability(String centerName, String workoutName, String startTime, User user) {
		Optional<Workout> workoutOpt = findGymWorkout(centerName, workoutName);
		if (workoutOpt.isPresent()) {
			Workout workout = workoutOpt.get();
			Optional<Slot> slotOpt = workout.getSlots().stream().filter(slot -> slot.getStartTime().equals(startTime)).findFirst();
			if (slotOpt.isPresent()) {
				Slot slot = slotOpt.get();
				if (slot.isPremium() && user.getType().equals(USER_TYPES.FK_VIP_USER.toString())) {
					if (slot.getNumberOfBooking() < slot.getNumberOfSeats()) {
						return true;
					}
				} else if (!slot.isPremium()){
					if (slot.getNumberOfBooking() < slot.getNumberOfSeats()) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
