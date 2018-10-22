package lesson7.model;

public class User {

	public static int counter;

	public String name;
	public String city;
	public int id;
	
	static{
		System.out.println("user static bloc");
	}

	{
		city = "Minsk";
		counter++;
		this.id = counter;
		System.out.println("user logic bloc");
	}

	public User(String name) {
		this.name = name;
		System.out.println("user constructor");
	}

}
