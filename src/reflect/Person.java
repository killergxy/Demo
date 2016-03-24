package reflect;

public class Person {
	private String name;
	private int age;
	private String sex;
	
	public Person(){};
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age ,String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	public String getName(String name){
		this.name = name;
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name:");
		sb.append(name);
		sb.append(",");
		sb.append("age:");
		sb.append(age);
		sb.append(",");
		sb.append("sex:");
		sb.append(sex);
		sb.append(".");

		return sb.toString();
	}

}
