package reusableMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	public static WebDriver driver;

	public String GetPropertyFileData(String propertyName) 
	{
		String propdata = null;
		Properties prop = new Properties();
		
			try {
				prop.load(new FileInputStream(new File("./properties/config.properties")));
				propdata =  prop.getProperty(propertyName);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return propdata;
	}

	public void WaitForElement(By by)
	{
		try {
			WebDriverWait waitCondition = new WebDriverWait(driver, 180);
			waitCondition.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, 0));
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println("Element Not Found:"+by+":"+e.getMessage());
		}
	}

	public void EnterData(String fieldname, By by, String data) {
		WaitForElement(by);
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(data);	
	}

	public void Click(String fieldname, By by) {
		WaitForElement(by);
		driver.findElement(by).click();
	}

}
