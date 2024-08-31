package flipfit.service;

import java.util.List;

import flipfit.dao.UserDao;
import flipfit.model.User;
import flipfit.utils.Constants;

public class UserService {
	
	UserDao userDoa;
	
	public UserService() {
		this.userDoa = new UserDao();
	}
	
	public User register(String userName, String userType) {
		long id = Constants.uniqueUserId++;
		User user = new User(id, userName, userType);
		this.userDoa.addUser(user);
		return user;
	}
	
	public List<User> getAllUser() {
		return this.userDoa.findAllUser();
	}

}
