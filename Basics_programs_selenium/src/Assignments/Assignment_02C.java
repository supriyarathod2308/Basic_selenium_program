package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment_02C {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(drag, 196,102).build().perform();
		
		
		TakesScreenshot take= (TakesScreenshot) driver; //====== screenshot
		File scr=take.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\admin\\Documents\\SOFTWARE TESTING NOTES\\ScreenShots\\Dragged.jpeg");
																							
		FileHandler.copy(scr, dest);

		
	}

}
