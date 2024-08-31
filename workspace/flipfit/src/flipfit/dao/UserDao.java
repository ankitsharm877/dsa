package flipfit.dao;

import java.util.ArrayList;
import java.util.List;

import flipfit.model.User;

public class UserDao {
	
	List<User> users;
	
	public UserDao() {
		this.users = new ArrayList<>();
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}
	
	public List<User> findAllUser() {
		return this.users;
	}

}
