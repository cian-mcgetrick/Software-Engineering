package cian_mcgetrick.assignment1;

import java.util.*;

public class Student {
	private String Name;
	private int age;
	private String dob;
	private String username; 
	private int id;
	private String course;
	private List<String> modules = new ArrayList<String>();
	
	
	public Student(String name, int age, String dob, int id, String course) {
		
		this.Name = name;
		this.age =  age; 
		this.dob = dob;
		
		this.id = id;
		
		this.course = course;
		
	}
	
	public String getUsername() {
		
		username = Name + String.valueOf(age);
		return username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<String> getModules() {
		return modules;
	}

	public void addModules(String m) {
		modules.add(m);
	}

	

}
