package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriHomePage {

	@FindBy(css = "a[class='fl nLogo']")
	private WebElement naukriLogoBtns;
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[1]")
	private WebElement naukriJobs;
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[2]")
	private WebElement naukriRecruiters;
	
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[3]")
	private WebElement naukriCompanies;
	
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[4]")
	private WebElement naukriTools;
	
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[5]")
	private WebElement naukriServices;
	
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[6]")
	private WebElement naukriMore;
	
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[7]")
	private WebElement naukriBellIcon;
	
	
	@FindBy(xpath = "(//div[@class=\"mTxt\"])[8]")
	private WebElement naukriMyNaukri;
	
	public NaukriHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void NaukriLogoBttn()
	{
		naukriLogoBtns.click();
	}
	public void NaukriJobsBtn()
	{
		naukriJobs.click();
	}
	
	public void NaukriRecruitersBtn() {
		naukriRecruiters.click();
	}
	
	public void NaukriCompaniesBtn(){
		naukriCompanies.click();
	}
	
	public void NaukriServicesBtn(){
		naukriServices.click();
	}
	
	public void NaukriMoreBtn(){
		naukriMore.click();
	}
	
	public void NaukriBellIconBtn(){
		naukriBellIcon.click();
	}
	
	public void NaukriMyNaukribtn(){
		naukriMyNaukri.click();
	}
	
	
}
