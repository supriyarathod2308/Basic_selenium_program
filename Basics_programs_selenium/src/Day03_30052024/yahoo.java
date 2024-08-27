package Day03_30052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F");
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.id("login-username"));
		login.sendKeys("sup123@gmail.com");
		
		WebElement sign=driver.findElement(By.id("login-signin"));
		if(sign.isDisplayed()) {	
		sign.click();
		System.out.println("sign in is displayed... test case is passed");
		}
		else
		{
			System.out.println("sign in is not displayed... test case is failed");
		}
		

	}

}
