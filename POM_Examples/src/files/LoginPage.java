package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectFiles.LoginObject;


public class LoginPage {

	@Test
	public void loginExample()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		


		LoginObject.userName(driver).sendKeys("user@phptravels.com");	
		LoginObject.password(driver).sendKeys("demouser");
		LoginObject.submitButton(driver).click();

	}

}
