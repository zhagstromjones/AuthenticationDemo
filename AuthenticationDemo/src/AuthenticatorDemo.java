/*
 * Program: AuthenticatorDemo
 * Author: Zach Hagstrom-Jones
 * Purpose: This short program demonstrates basic logic concerning authentication and roles.
 */
import java.util.HashMap;

public class AuthenticatorDemo {

	public static void main(String[] args) {
		// Generate users and their roles. Users are simulated using a hashmap with
		// their usernames serving as keys and their role serving as values. Role
		// determines what privileges they unlock.
		HashMap<String, String> roleMap = new HashMap<>();
		roleMap.put("admin1", "admin");
		roleMap.put("admin2", "admin");
		roleMap.put("user1", "user");
		roleMap.put("user2", "user");
		
		System.out.println(login(roleMap.get("admin1")));
		System.out.println(login(roleMap.get("admin2")));
		System.out.println(login(roleMap.get("user1")));
		System.out.println(login(roleMap.get("user2")));
		
		
	}
	
	/*
	 * This method demonstrates two different endpoints by taking the String
	 * "role" as an argument and determining what kind of access the user
	 * has based on this role. This function is easily scalable if more roles
	 * need to be implemented.
	 */
	public static String login(String role) {
		// Administrator role is checked first. If the role is administrator,
		// additional privileges are unlocked for the user.
		if (role.contains("admin")) {
			return "Welcome admin. Admin privileges and basic functionality unlocked.";
		}
		// Function defaults to basic user to enforce the principle of least privilege.
		else {
			return "Welcome user. Basic functionality unlocked";
		}
	}

}
