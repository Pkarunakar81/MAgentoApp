

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home 
{
	WebDriver driver;
	By myacc=By.linkText("My Account");
	public Home(WebDriver driver) 
	{
		this.driver = driver;
	}	
	public void clickOnMyacc() 
	{
		driver.findElement(myacc).click();
	}
}