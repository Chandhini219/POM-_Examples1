package files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectFiles.LoginObject;
import objectFiles.PageFactoryObject_Example;

public class PageFactoryExample {
	

		@Test
		public void loginExample()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.phptravels.net/login");
			
			PageFactory.initElements(driver,LoginObject.class);
			LoginObject.userName.sendKeys("user@phptravels.com");
			LoginObject.password.sendKeys("demouser");
			LoginObject.submitButton.click();
			
			PageFactory.initElements(driver,PageFactoryObject_Example.class);
			PageFactoryObject_Example.clickonProfile.click();
			PageFactoryObject_Example.password.sendKeys("abc");
			PageFactoryObject_Example.city.sendKeys("CBE");
			PageFactoryObject_Example.state.sendKeys("tamil nadu");
			PageFactoryObject_Example.submit.click();
			
			
			
			
		}

}
