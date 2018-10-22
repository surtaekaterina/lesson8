package lesson7.model;

public class A {

	int a;
	{
		a = 3;
		System.out.println("a{3}");
	}

	public A() {
		super();
		System.out.println("a");

	}

	public void greetUser() {
		System.out.println("Greet from A");
	}
}
