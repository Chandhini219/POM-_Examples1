package objectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {
	@FindBy(name="username")
	public static WebElement userName;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/button")
	public static WebElement submitButton;
	

	/*public static WebElement userName(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	public static WebElement submitButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
	}*/
}
