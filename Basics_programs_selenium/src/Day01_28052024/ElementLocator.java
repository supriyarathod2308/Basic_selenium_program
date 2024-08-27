package Day01_28052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("हिन्दी")).click();
		
		driver.findElement(By.className("gLFyf")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).clear();
	}

}
