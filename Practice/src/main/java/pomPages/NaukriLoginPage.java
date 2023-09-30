package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriLoginPage {

	@FindBy(id="login_Layer")
	private WebElement loginBtn;
	
	@FindBy(css="input[placeholder='Enter your active Email ID / Username']")
	private WebElement userName;
	
	@FindBy(css="input[placeholder='Enter your password']")
	private WebElement passWord;
	
	@FindBy(css="button[type='submit']")
	private WebElement loginSubmitBtn;
	
	public NaukriLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void LoginTextBtn()
	{
		loginBtn.click();
	}
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	
	public void LoginSubmitBtn(){
		loginSubmitBtn.click();
	}
	
}
