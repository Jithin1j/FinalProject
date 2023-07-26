package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {
	WebDriver driver;
	
	By firstname =By.xpath("//input[@placeholder='First name(*)']");
	By lastname = By.xpath("//input[@placeholder='Last name(*)']");
	By mobile = By.xpath("//input[@placeholder='Mobile(*)']");
	By email = By.xpath("//input[@placeholder='Email id(*)']");
	By pass = By.xpath("//input[@placeholder='Password(*)']");
	By sign = By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/form/div[6]/input");

	
	public RegPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void link()
	{
	driver.get("https://www.nilkamalfurniture.com/account/login?return_url=%2Faccount");
	}
	public void setvalues()
	{
		driver.findElement(firstname).sendKeys("JIthin");
		driver.findElement(lastname).sendKeys("Joy");
		driver.findElement(mobile).sendKeys("1234567888");
		driver.findElement(email).sendKeys("testerg245@gmail.com");
		driver.findElement(pass).sendKeys("jithin@1234");
	}
	public void click()
	{
		driver.findElement(sign).click();
	}
}
