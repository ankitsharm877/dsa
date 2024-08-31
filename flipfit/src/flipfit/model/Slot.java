package flipfit.model;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	
	private long id;
	private String startTime;
	private int numberOfSeats;
	private int numberOfBooking;
	private int queueSize;
	private boolean isPremium;
	
	private List<User> users;
	
	public Slot(long id, String startTime, int numberOfSeats, int numberOfBooking, int queueSize) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.numberOfSeats = numberOfSeats;
		this.numberOfBooking = numberOfBooking;
		this.queueSize = queueSize;
		this.users = new ArrayList<>();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public int getNumberOfBooking() {
		return numberOfBooking;
	}
	public void setNumberOfBooking(int numberOfBooking) {
		this.numberOfBooking = numberOfBooking;
	}
	public int getQueueSize() {
		return queueSize;
	}
	public void setQueueSize(int queueSize) {
		this.queueSize = queueSize;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
}
