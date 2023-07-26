package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
public class CheckoutPage {
	WebDriver driver;
	By address=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[5]/div/input");
	By city=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[7]/div/input");
	By state=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[8]/div/select");
	By pincode=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[9]/div/input");
	By phone=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[10]/div/input[1]");
	By proceed=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[2]/button[1]");
	
	public CheckoutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void setvalues()
	{
		driver.findElement(address).sendKeys("School yuiop Old Canteen Street");
		driver.findElement(city).sendKeys("kochi");
		driver.findElement(pincode).sendKeys("691520");
		driver.findElement(phone).sendKeys("1234567888");
	}
	public void select()
	{
		Select sl=new Select(driver.findElement(state));
		sl.selectByVisibleText("Kerala");
	}
	public void click()
	{
		driver.findElement(proceed).click();
	}

}
