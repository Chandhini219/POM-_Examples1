package objectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileObject {
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement clickonProfile;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(name="city")
	public static WebElement city;
	@FindBy(name="state")
	public static WebElement state;
	
	
	/*public static WebElement clickonProfile(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	public static WebElement city(WebDriver driver)
	{
		return driver.findElement(By.name("city"));
	}
	public static WebElement state(WebDriver driver)
	{
		return driver.findElement(By.name("state"));
	}*/

}
