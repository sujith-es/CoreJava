package Class;

public class Dating {

	public Dating() {

	}

	public Dating(String name, int age) {
		this.name = name;
		this.age=age;
	}

	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
