package Pages;

import org.global.Globallibrary;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LogicalFlow extends Globallibrary {
	
	public LogicalFlow() {
	    System.out.println("constructor");       
		global.getDriver();
	}

	Globallibrary global = new Globallibrary();
	
	
	 

}
