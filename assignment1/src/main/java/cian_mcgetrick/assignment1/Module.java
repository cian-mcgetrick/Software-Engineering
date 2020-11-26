package cian_mcgetrick.assignment1;

import java.util.*;

public class Module {
	private String modName;
	private String modID;
	private List<Student> students = new ArrayList<Student>();
	private List<Course> modCourses = new ArrayList<Course>();
	
	
	public Module(String modName, String modId) {
		
		this.modName = modName;
		this.modID = modId;
		
	}


	public String getModName() {
		return modName;
	}


	public void setModName(String modName) {
		this.modName = modName;
	}


	public String getModID() {
		return modID;
	}


	public void setModID(String modID) {
		this.modID = modID;
	}


	public void getStudents() {
		for(Student i:students) {
			System.out.println(i.getUsername());
		}
	}


	public void addStudents(Student s) {
		students.add(s);
	}


	public void getCourse() {
		for(Course i:modCourses) {
			System.out.println(i.getCourseName());
		}
	}


	public void addModCourses(Course c) {
		modCourses.add(c);
	}

	
	

}
