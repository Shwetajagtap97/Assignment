import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupAnnotation {
	@Test(groups="Smoke",priority=3)
	public void Demo(){
	Reporter.log("Smoke", true);	
	}
	
	@Test(groups="Funtions",dependsOnGroups="Smoke")
	public void Demo1(){
	Reporter.log("Funtions1", true);	
	}
	
	@Test(groups="Smoke",priority=2)
	public void Demo2(){
	Reporter.log("Smoke1", true);	
	}
	
	@Test(groups="Funtions",dependsOnGroups="Smoke")
	public void Demo3(){
	Reporter.log("Funtions3", true);	
	}
	
	@Test(groups="Smoke",priority=4)
	public void Demo4(){
	Reporter.log("Smoke2", true);	
	}
	
	@Test(groups="System",dependsOnGroups="Funtions")
	public void Demo5(){
	Reporter.log("System", true);	
	}
	
	@Test(groups="Smoke")
	public void Demo6(){
	Reporter.log("Smoke3", true);	
	}
}
