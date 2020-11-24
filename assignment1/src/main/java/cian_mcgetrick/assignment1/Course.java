package cian_mcgetrick.assignment1;

//Import necessary libraries
import java.util.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;


public class Course {

private String courseName;

DateTime start = new  DateTime();
DateTime end = new DateTime();
private List<String> Modules = new ArrayList<>();
private List<String> Students = new ArrayList<>();


//constructor
Course (String courseName, String startDate, String endDate) {
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
public List<String> getModuleList() {
return Modules;
}


//get method for list of students
public List<String> getStudentList() {
return Students;
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
