package cian_mcgetrick.assignment1;

import java.util.*;

public class Student {
	private String Name;
	private int age;
	private String dob;
	private String username; 
	private int id;
	private Course course;
	private List<Module> modules = new ArrayList<Module>();
	
	
	public Student(String name, int age, String dob, int id, Course course) {
		
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void getModules() {
		for(Module i:modules) {
			System.out.println(i.getModName());
		}
	}

	public void addModules(Module m) {
		modules.add(m);
	}

	public String toString() {
		
		String s = this.getUsername() + " " + course.getCourseName();
		return s;
	}

}
