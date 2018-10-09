package testCases;

import org.testng.annotations.Test;
import webPages.VehicleRegistration;
import reusableMethods.ConfigurationClass;

public class TestCase_1 extends ConfigurationClass{

	@Test
	public void Method1()
	{
		VehicleRegistration obj = new VehicleRegistration();
		obj.ClickVehicleRegistrationTab();
		System.out.println("");

	}
}
