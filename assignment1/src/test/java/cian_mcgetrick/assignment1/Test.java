package cian_mcgetrick.assignment1;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Test extends TestCase {


	@org.junit.Test
	public void test() {
	
	

	

	// Tests  moduleName and moduleID
	
	Module module1 = new Module("Software Engineering III", "CT1234");
	String output1 = module1.getModName();
	assertEquals("Software Engineering III", output1);
	String output2 = module1.getModID();
	assertEquals("CT1234", output2);


	
	// Tests getStartDate() and getEndDate();
	Course course1 = new Course("ECE", "28/9/2020 00:00:00", "4/6/2021 00:00:00");
	DateTime start = course1.getStartDate();
	DateTime start2 = DateTime.parse("28/9/2020 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
	assertEquals(start2,start);
	DateTime end = course1.getEndDate();
	DateTime end2 = DateTime.parse("4/6/2021 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));

	assertEquals(end2,end);
	
	// Tests  getUsername
	Student student1 = new Student("Cian", 21, "02/09/1998", 17280022, course1);
	String output = student1.getUsername();
	assertEquals("Cian21", output);
	}
	}

