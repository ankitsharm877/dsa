package flipfit.model;

import java.util.ArrayList;
import java.util.List;

public class Gym {
	
	private long id;
	private String name;
	private String city;
	private String location;
	private double lati;
	private double longi;
	
	private List<Workout> workouts;
	
	public Gym(long id, String name, String city, String location, double lati, double longi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.location = location;
		this.lati = lati;
		this.longi = longi;
		this.workouts = new ArrayList<>();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getLati() {
		return lati;
	}
	public void setLati(double lati) {
		this.lati = lati;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	
	public List<Workout> getWorkouts() {
		return workouts;
	}
	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}
	@Override
	public String toString() {
		return "Gym [id=" + id + ", name=" + name + ", city=" + city + ", location=" + location + ", lati=" + lati
				+ ", longi=" + longi + "]";
	}	
}
