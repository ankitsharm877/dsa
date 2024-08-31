package zenAndart;

import java.util.HashSet;

public class Round2 {

	public static void main(String[] args) {
		String str = "APple";
		//String str = "baby";
		System.out.println(removeDuplicates(str));
		
		// login page -> user password, controller, service, 
		//dao ->
		// method (username, password)
		//decode
		//'select * from users u where u.username = '+ username +' and u.password =' + password;

		//(select username from users u where u.name like "%Ankit%")

		//(select password from users u where u.name like "%Ankit%")
	}
	
	// remove duplicate str = "apple" -> out = "aple"
	// str = "baby" -> out = "bay"
	//APple
	public static String removeDuplicates(String str) { //O(n)
		if (str == null || str.isEmpty()) {
			return str;
		}
		String res = "";
		//HashMap<Character, Integer> hm = new HashMap<>();
		HashSet<String> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (!set.contains((ch + "").toLowerCase())) {
				res += ch;
				set.add((ch+ "").toLowerCase());
			}
		}
		return res;
	}
}