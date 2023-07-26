package Test;

import org.testng.annotations.Test;
import Pages.ProductPage;
public class ProductTest extends LoginTest{
	@Test(priority=2)
	public void VerifyProduct() throws Exception
	
	{
		ProductPage pp= new ProductPage(driver);
		Thread.sleep(6000);
		pp.mouse();
		Thread.sleep(2000);
		pp.click();
		Thread.sleep(2000);
		pp.pin();
		Thread.sleep(3000);
		pp.cart();
		Thread.sleep(5000);
		pp.ca();
		Thread.sleep(3000);
		pp.check();
		
	}

}
