package Test;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.RegPage;

public class RegTest extends BaseClass {
	
	@Test
	
	public void reg() throws Exception 
	{
		RegPage v = new RegPage(driver);
		v.link();
		Thread.sleep(3000);
		v.setvalues();
		Thread.sleep(3000);
		v.click();
		Thread.sleep(3000);
	
	}
	

}
