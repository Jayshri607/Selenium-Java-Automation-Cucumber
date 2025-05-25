package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHooks {

//	@Before(order=3)
//	public void beforehook1() {
//		System.out.println("Beforehook1 executing");
//	}
//	@After(order=2)
//	public void afterhook1()
//	{
//		System.out.println("Afterhook1 is executing");
//	}
//
//	@Before(order=1)
//	public void beforehook2() {
//		System.out.println("Beforehook2 executing");
//	}
//	@After(order=4)
//	public void afterhook2()
//	{
//		System.out.println("Afterhook2 is executing");
//	}
	
	@BeforeStep
	
	public void beforestep1()
	{
		System.out.println("Before step executing");
	}
	@AfterStep
	public void afterstep() {
		System.out.println("After step executing");
	}
	
	@BeforeAll
	public static void beforeall()
	{
		System.out.println("before all executing");
		
	}
	@AfterAll()
	public static void afterall()
	{
		System.out.println("Afterall executing");
	}

}
