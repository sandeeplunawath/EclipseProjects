package webPages;

import org.openqa.selenium.By;

import reusableMethods.GenericMethods;

public class VehicleRegistration extends GenericMethods{
	
	public VehicleRegistration ClickVehicleRegistrationTab()
	{
		Click("Vehicle Verification Tab", By.xpath("//a//span[text()='Vehicle Verification']"));
		return this;
	}

}
