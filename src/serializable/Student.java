package serializable;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 序列化编号
	 */
	private static final long serialVersionUID = 7611477772530307272L;
	int age;
	int score;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
