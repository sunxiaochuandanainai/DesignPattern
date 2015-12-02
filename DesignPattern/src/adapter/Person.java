package adapter;

public class Person implements Human{

	
	private int age;
	private String name;
	
	
	public Person(String name, int age) {
		
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println(name + " is " + age + " years old and he/she is human being who can think and create");
	}

	@Override
	public void feel() {
		// TODO Auto-generated method stub
		System.out.println(name + " has feelings and emotions");
	}

	
	
}
