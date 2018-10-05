package reusableMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ConfigurationClass extends GenericMethods{
	
	@BeforeClass
	public void Launch()
	{
		String path = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.get(GetPropertyFileData("url"));
		Login();
	}
	
	public void Login()
	{
		EnterData("User Name", By.id("txtUser"), GetPropertyFileData("username"));	
		EnterData("Password", By.id("txtPwd"), GetPropertyFileData("password"));	
		Click("Submit Button", By.xpath("//input[@id='txtPwd']/ancestor::div[1]/following-sibling::div[2]/button"));
	}

	@AfterClass
	public void CleanUp()
	{
		driver.quit();
	}
	
	
}
