package Day02_29052024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
//===========================Link Tag================================
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
//===========================TextBox ================================		
		driver.findElement(By.name("firstname")).sendKeys("supriya");
		driver.findElement(By.name("lastname")).sendKeys("rathod");
		driver.findElement(By.name("reg_email__")).sendKeys("987456123");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin123");
		
//===========================Check Box================================		
		WebElement Day=driver.findElement(By.id("day"));
		Select scday=new Select(Day);
		scday.selectByIndex(27);
		
		WebElement Month=driver.findElement(By.id("month"));
		Select scmonth= new Select(Month);
		scmonth.selectByValue("9");
		
		WebElement Year=driver.findElement(By.id("year"));
		Select scyear=new Select(Year);
		scyear.selectByVisibleText("1997");
		
//==========================================Radio button=================================================		
		List<WebElement>gender=driver.findElements(By.name("sex"));
		/*1. one way for radio button.*/
		//gender.get(1).click(); 
			
		
		/* 2. another way for radio button.*/
//		for(int i=0;i<gender.size();i++) {
//			gender.get(i).click();
//		}
	
		/* 3. another way for radio button.*/
		 for(int i=0;i<gender.size();i++) {
			 String value= gender.get(i).getAttribute("value");
			 if(value.equals("2")) 
			 {
				 gender.get(i).click(); 
			 } Thread.sleep(1000);
		 }
		
//==========================================Sign in button=================================================		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
