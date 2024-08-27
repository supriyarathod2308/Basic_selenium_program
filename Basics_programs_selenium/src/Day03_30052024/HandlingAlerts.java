package Day03_30052024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
