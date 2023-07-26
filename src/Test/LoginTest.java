package Test;

import org.testng.annotations.Test;

import Pages.LoginPage;

import Base.BaseClass;

public class LoginTest extends BaseClass{
	@Test(priority=1)
	public void VerifyLogin() throws Exception
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.icon();
		Thread.sleep(3000);
		lp.setvalues();
		Thread.sleep(3000);
		lp.click();
	}
}
