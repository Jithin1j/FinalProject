package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
	WebDriver driver;
	
	By select= By.xpath("/html/body/div[3]/header[2]/div/div[3]/div/div[1]/ul/div[1]/li[4]/a");
	By game=By.xpath("/html/body/div[3]/header[2]/div/div[3]/div/div[1]/ul/div[1]/li[4]/ul/li[3]/a");
	By chair= By.xpath("/html/body/div[5]/div/div[3]/div[1]/div[7]/div/div/div[1]/a");
	By pinchange = By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[1]/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div/div/div[2]/table/tbody/tr[1]/th/a");
	By pincode=By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[1]/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div/div/div[1]/div/input[1]");
	By check =By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[1]/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div/div/div[1]/div/input[2]");
	By cart= By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[1]/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/div[5]/button[1]");
	By check1= By.xpath("/html/body/div[3]/header[2]/div/div[2]/div/div[4]/div[2]/div/form/ul[2]/li[2]/input");

public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
public void mouse()
{
	Actions a= new Actions(driver);
	WebElement w= driver.findElement(select);
	a.moveToElement(w).perform();
}
public void click()
{
	driver.findElement(game).click();
	driver.findElement(chair).click();

}
public void pin()
{
	driver.findElement(pincode).sendKeys("691520");
}
public void cart()
{
	driver.findElement(check).click();
}
public void ca()
{
	driver.findElement(cart).click();
}
public void check()
{
	driver.findElement(check1).click();
}
	
}

