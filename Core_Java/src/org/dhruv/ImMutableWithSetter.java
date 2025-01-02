package org.dhruv;

public final class ImMutableWithSetter {
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public ImMutableWithSetter setId(int id) {
		//this.id = id;
		return ImMutableWithSetter.getInstance(id, this.name, this.id);
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
	private ImMutableWithSetter(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	 

	public static ImMutableWithSetter getInstance(int id, String name, int age)
	{
		return new ImMutableWithSetter(id, name, age);
	}
	@Override
	public String toString() {
		return "ImMutableWithSetter [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}


