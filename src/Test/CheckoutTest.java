package Test;

import org.testng.annotations.Test;
import Pages.CheckoutPage;

public class CheckoutTest extends ProductTest{
	@Test(priority=3)
	public void VerifyCheckout() throws Exception
	{
		CheckoutPage cp= new CheckoutPage(driver);
		cp.setvalues();
		Thread.sleep(6000);
		cp.select();
		Thread.sleep(3000);
		cp.click();
	}

}
