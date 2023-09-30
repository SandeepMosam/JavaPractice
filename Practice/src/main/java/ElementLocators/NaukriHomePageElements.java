package ElementLocators;

import org.openqa.selenium.By;

public class NaukriHomePageElements extends LoginPages {
	
	public static void HomePage() throws InterruptedException {
		
		driver.findElement(By.cssSelector("a[class='fl nLogo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"mTxt\"])[8]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LoginPages l = new LoginPages();
		
		l.Drivers();
		l.loginPage();
		
		HomePage();
		
		
		
		
		
		
		
		

	}

}
