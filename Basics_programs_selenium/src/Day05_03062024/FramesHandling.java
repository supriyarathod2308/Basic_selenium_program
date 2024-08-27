package Day05_03062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//ul[@title='Packages']/child::li[1]/child::a")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();     // should come back to main frame then only u can enter to another frame
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//ul[@title='Classes']/descendant::a[1]")).click();
	}

}