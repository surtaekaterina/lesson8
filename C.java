package lesson7.model;

public class C extends B {
	int c = 5;
	public static int cc = 10;

	// логический блок, сраб перед конструктором
	{
		c = 7;
		System.out.println("c{}");
	}

	public C() {
		super();
		c = 6;
		System.out.println("c");
	}

	public void toDo() {
		System.out.println("c");
	}

	public void toDoStatic() {
		System.out.println("todo Static c");
	}

}
