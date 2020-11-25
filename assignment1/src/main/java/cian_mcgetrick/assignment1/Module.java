package cian_mcgetrick.assignment1;

import java.util.*;

public class Module {
	private String modName;
	private String modID;
	private List<String> students = new ArrayList<String>();
	private List<String> modCourses = new ArrayList<String>();
	
	
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


	public String getStudents() {
		return students.toString();
	}


	public void addStudents(String s) {
		students.add(s);
	}


	public String getModCourses() {
		return modCourses.toString();
	}


	public void addModCourses(String c) {
		modCourses.add(c);
	}


	

}
