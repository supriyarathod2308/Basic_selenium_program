package Day02_29052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validation_demo {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
	//===========================IsDisplayed validation================================
			WebElement create=driver.findElement(By.linkText("Create new account"));
			if(create.isDisplayed()) 
			{
				create.click();
				System.out.println("Link button is enabled..... Test case is pass");
			}
			else 
			{
				System.out.println("Link button is not enabled..... Test case is failed");
			}
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("firstname")).sendKeys("supriya");
			driver.findElement(By.name("lastname")).sendKeys("rathod");
			driver.findElement(By.name("reg_email__")).sendKeys("987456123");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Admin123");
			
//============================Drop Down by using select method=================================			
			WebElement Day=driver.findElement(By.id("day"));
			Select scday=new Select(Day);
			scday.selectByIndex(27);
			
			WebElement Month=driver.findElement(By.id("month"));
			Select scmonth= new Select(Month);
			scmonth.selectByValue("9");
			
			WebElement Year=driver.findElement(By.id("year"));
			Select scyear=new Select(Year);
			scyear.selectByVisibleText("1997");
			
	//==========================================IsSelected validation for radio button=================================================		
			WebElement radio=driver.findElement(By.xpath("//input[@value=‘1’]"));
			if(!(radio.isSelected())) 
			{
				radio.click();
				
				System.out.println("radio button is not clicked...test case is passed");
			}
			else 
			{
				System.out.println("radio button is clicked...test case is failed");
			}
			Thread.sleep(1000);
			
			WebElement radio1=driver.findElement(By.name("sex"));
			if(!(radio1.isSelected())) 
			{
				radio1.click();
				
				System.out.println("radio1 button is not clicked...test case is passed");
			}
			else 
			{
				System.out.println("radio1 button is clicked...test case is failed");
			}
			
			
	//==========================================IsEnabled validation=================================================		
			WebElement sign=driver.findElement(By.name("websubmit"));
			
			if(sign.isEnabled()) {
			
				sign.click();
				System.out.println("test case for sign is passed");
			}
			else 
			{
				System.out.println("test case for sign is failed");
			}
			
			Thread.sleep(3000);
			
			driver.close();
			
			

		}

	}

