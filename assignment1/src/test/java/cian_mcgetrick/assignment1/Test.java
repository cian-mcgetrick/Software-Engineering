package cian_mcgetrick.assignment1;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.joda.time.DateTime;

public class Test extends TestCase {


	@org.junit.Test
	public void test() {
	
	// Tests  getUsername
	Student student1 = new Student("Cian", 21, "02/09/1998", 17280022, "ECE");
	String output = student1.getUsername();
	assertEquals("Cian21", output);

	

	// Tests  moduleName and moduleID
	
	Module module1 = new Module("Software Engineering III", "CT1234");
	String output1 = module1.getModName();
	assertEquals("Software Engineering III", output1);
	String output2 = module1.getModID();
	assertEquals("CT1234", output2);


	
	// Tests getStartDate() and getEndDate();
	Course course1 = new Course("ECE", "28/9/2020", "4/6/2021");
	DateTime start = course1.getStartDate();
	assertEquals("28/9/2020",start);
	DateTime end = course1.getEndDate();
	assertEquals("4/6/2021",end);
	}
	}

