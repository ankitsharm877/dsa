package flipfit.model;

import java.util.ArrayList;
import java.util.List;

public class Workout {

	private long id;
	private String name;
	
	private List<Slot> slots;
	
	public Workout(long id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.slots = new ArrayList<>();
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
	public List<Slot> getSlots() {
		return slots;
	}
	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}
	@Override
	public String toString() {
		return "Workout [id=" + id + ", name=" + name + "]";
	}
}
