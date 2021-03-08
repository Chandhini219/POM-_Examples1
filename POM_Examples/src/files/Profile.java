package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectFiles.LoginObject;
import objectFiles.ProfileObject;

public class Profile {
	
	public  void profileUpdate()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
	ProfileObject.clickonProfile(driver).click();
	ProfileObject.password(driver).sendKeys("abc");
	ProfileObject.city(driver).sendKeys("cbe");
	ProfileObject.state(driver).sendKeys("tamil nadu");
		
		
	}
	
}
