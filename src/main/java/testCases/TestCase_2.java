package testCases;

import org.testng.annotations.Test;

import reusableMethods.ConfigurationClass;
import webPages.PartyVerification;

public class TestCase_2 extends ConfigurationClass{

	@Test
	public void Method1()
	{
	PartyVerification obj = new PartyVerification();
	obj.ClickPartyVerificationTab();
	
	}
}
