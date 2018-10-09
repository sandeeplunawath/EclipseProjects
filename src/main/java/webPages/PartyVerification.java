package webPages;

import org.openqa.selenium.By;

import reusableMethods.GenericMethods;

public class PartyVerification extends GenericMethods{

	public PartyVerification ClickPartyVerificationTab()
	{
		Click("Party Verification Tab", By.xpath("//a//span[text()='Party Verification']"));
		
		return this;
		
	}
	
	
}
