package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_02B {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("001");
		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);
		
		Alert a= driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(2000);
		
		Alert b= driver.switchTo().alert();
		b.accept();
		
		Thread.sleep(2000);
	}
	
}
