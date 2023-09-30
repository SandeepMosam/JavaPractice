package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstNaukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.firstnaukri.com/");
				driver.findElement(By.linkText("Login")).click();
				driver.findElement(By.id("loginEmail")).sendKeys("nagajada5@gmail.com");
				driver.findElement(By.id("loginPassword")).sendKeys("NagaMca07");
				driver.findElement(By.id("loginSubmitBtn")).click();
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("a[class='fn_bdrNo']")).click();
				driver.findElement(By.cssSelector("a[class='resume-btn']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("(//span[@class='action-link'])[2]")).click();
				
				
			}

		
	
}
