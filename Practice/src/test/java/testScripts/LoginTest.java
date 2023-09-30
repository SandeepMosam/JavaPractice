package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.NaukriLoginPage;

public class LoginTest extends BaseClass{
	
	public void login() {
		
		NaukriLoginPage NLP = new NaukriLoginPage(driver);
		NLP.LoginTextBtn();
		//NLP.UserNameEntry();
		//NLP.PasswordEntry();
		
	}
	

}
