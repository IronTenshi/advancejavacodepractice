package arraylist;

public class User {
	private String name;
	private double ID;
	private double password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getID() {
		return ID;
	}
	public void setID(double iD) {
		ID = iD;
	}
	public double getPassword() {
		return password;
	}
	public void setPassword(double password) {
		this.password = password;
	}
	public User(String name, double iD, double password) {
		super();
		this.name = name;
		ID = iD;
		this.password = password;
	}
	
	
}
