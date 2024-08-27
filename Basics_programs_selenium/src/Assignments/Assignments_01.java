package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		List<WebElement> radio=driver.findElements(By.name("webform"));
		radio.get(0).click();
		
		WebElement chechbox1= driver.findElement(By.id("vfb-6-0"));
		chechbox1.click();
		WebElement chechbox2= driver.findElement(By.id("vfb-6-1"));
		chechbox2.click();
		Thread.sleep(2000);
		
//========================selecting country=======================================	
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement Country=driver.findElement(By.name("country"));
		Select sc=new Select(Country);
		sc.selectByValue("KUWAIT");

		
		
	}

}
