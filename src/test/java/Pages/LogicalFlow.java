package Pages;

import org.global.Globallibrary;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LogicalFlow extends Globallibrary {
	
	public LogicalFlow() {
	    System.out.println("constructor");       
	
	}
	
	@Test 
	public void program()
	{
		Globallibrary g = new Globallibrary();
		g.getDriver();
		System.out.println("starting of main ");
	}

}
