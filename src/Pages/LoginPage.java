package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By icon= By.xpath("/html/body/div[3]/header[2]/div/div[2]/div/div[4]/ul/li/a");
	By email= By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/form/input[3]");
	By password= By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/form/input[4]");
	By login= By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/form/input[5]");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void icon ()
	{
		driver.get("https://www.nilkamalfurniture.com/account/login?return_url=%2Faccount");
		
	}
	public void setvalues()
	{
		driver.findElement(email).sendKeys("testerg245@gmail.com");
		driver.findElement(password).sendKeys("jithin@1234");
	}
	public void click()
	{
		driver.findElement(login).click();
	}

}
