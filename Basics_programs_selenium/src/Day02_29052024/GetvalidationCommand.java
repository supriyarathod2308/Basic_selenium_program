package Day02_29052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetvalidationCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
//========================Get Title=====================================================		
		System.out.println(driver.getTitle());
		
		String actualTitle= driver.getTitle();
		String exptTitle="Facebook – log in or sign up";
		
		if(actualTitle.equals(exptTitle)) {
			System.out.println("Both title is matched....testcase is passed");
		}else {
			System.out.println("Both title is not matched....testcase is failed");
		}
//==================================== Current url=======================================
		//driver.findElement(By.linkText("Forgotten password?")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
//============================Attribute==================================================
		
		WebElement Login=driver.findElement(By.name("login"));
		System.out.println(Login.getAttribute("value"));
		
		System.out.println(Login.getTagName());
		
		System.out.println(Login.getSize());
		
		
		
		

	}

}
