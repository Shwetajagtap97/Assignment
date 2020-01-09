import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerDemo.class)
public class FlowofAnnotation {
	@Test(dependsOnMethods="Demo2")
	public void Demo(){
	Reporter.log("A", true);	
	}
	
	@Test()
	public void Demo1(){
	Reporter.log("B", true);	
	}
	
	@Test(dependsOnMethods="Demo1")
	public void Demo2(){
	Reporter.log("C", true);	
	}
	@Test()
	public void Demo3(){
	Reporter.log("D", true);	
	}	
}
