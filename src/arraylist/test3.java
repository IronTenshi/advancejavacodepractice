package arraylist;

import java.util.ArrayList;

public class test3 {
	public static void main(String[] args) {
		ArrayList<User> listUsers = new ArrayList<User>();
		
		User u1 = new User("genshin1", 123, 898898);
		User u2 = new User("genshin2", 1223123, 89823898);
		User u3 = new User("genshin3", 12233, 898893238);
		
		listUsers.add(u1);
		listUsers.add(u2);
		listUsers.add(u3);
		
		for (User user : listUsers)
		{
			System.out.println(user.getName());
		}
	}
}
