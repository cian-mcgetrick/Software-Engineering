package cian_mcgetrick.assignment1;

//Import necessary libraries
import java.util.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;


public class Course {

private String courseName;

DateTime start = new  DateTime();
DateTime end = new DateTime();
private List<Module> Modules = new ArrayList<>();
private List<Student> Students = new ArrayList<>();


//constructor
public Course (String courseName, String startDate, String endDate) {
this.courseName = courseName;

//DateTime using DateTimeFormatter

start = DateTime.parse(startDate, DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));

 end = DateTime.parse(endDate,DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
}



public void setCourseName(String courseName) {
this.courseName = courseName;
}

public String getCourseName() {
return courseName;
}


//get method for module name
public void getModuleList() {
	for(Module i:Modules) {
		System.out.println(i.getModName());
	}
}


//get method for list of students
public void getStudentList() {
	for(Student i:Students) {
		System.out.println(i.getUsername());
	}
}

// add modules and students

public void addStudent(Student s) {
	Students.add(s);
}

public void addModules(Module m) {
	Modules.add(m);
}
//set and get methods for start date
public void setStartDate(String startDate) {
	start = DateTime.parse(startDate, DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
}

public DateTime getStartDate() {
return start;
}


//set and get methods for end date
public void setEndDate(String endDate) {
	end = DateTime.parse(endDate, DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
}

public DateTime getEndDate() {
return end;
}
}
