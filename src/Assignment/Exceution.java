package Assignment;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exceution {
	@Test(groups="functions",dependsOnGroups="smoke")
	public void Demo(){
		Reporter.log("Fuction1", true);
	}
	@Test(groups="abc",dependsOnGroups="system")
	public void Demo1(){
		Reporter.log("abc", true);
	}
	@Test(groups="smoke",invocationCount=3,priority=2)
	public void Demo2(){
		Reporter.log("smoke1", true);
	}
	@Test(groups="system",dependsOnGroups="functions")
	public void Demo3(){
		Reporter.log("System1", true);
	}
	@Test(groups="smoke",invocationCount=2,priority=1)
	public void Demo4(){
		Reporter.log("smoke2", true);
	}
	@Test(groups="functions",dependsOnGroups="smoke")
	public void Demo5(){
		Reporter.log("Fuction2", true);
	}
}
