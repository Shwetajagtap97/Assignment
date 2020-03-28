
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
	
	public class AssertDemo {
	@Test
	public void Demo(){
	List li=new ArrayList<>();
	li.add("Shweta");
	li.add("Sam");
	li.add(2);
	li.add("Ketan");
	li.add(true);
	List lis=new ArrayList<>();
	lis.add("Shweta");
	lis.add("Sam");
	lis.add(22);
	lis.add("Ketan");
	lis.add(true);	
	Assert.fail();
	Assert.assertEquals(li, lis);
	//SoftAssert sa= new SoftAssert();
	//sa.assertEquals(li, lis);
	Reporter.log("Hello", true);
	//sa.assertAll();
	
	}

	
	
}
