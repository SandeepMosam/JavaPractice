package ElementLocators;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPages {
	
	public static WebDriver driver;
	
	public void Drivers() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
	}

	  public  void loginPage() throws InterruptedException {
		
		driver.findElement(By.id("login_Layer")).click();
		
		//driver.getWindowHandles();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("nagajada5@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("NagaMca07");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//driver.get("https://www.skillrary.com/user/login");
		//driver.findElement(By.name("email")).sendKeys("nagajada@gmail.com");
		//driver.findElement(By.linkText("Jobs")).click();
		
		//driver.findElement(By.partialLinkText("Compa")).click();
		//driver.findElement(By.cssSelector("a[data-ga-track=\"Main Navigation Companies|Companies Icon\"]")).click();
		Thread.sleep(7000);
		//driver.close();
		
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("QA Software Testing");
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hyderabad");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}
