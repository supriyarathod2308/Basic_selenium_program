package Day06_04062024;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/women-ethnic-wear");
		Thread.sleep(1000);
		
		MethodForScreenshot sc= new MethodForScreenshot(driver);
		sc.screen("Ethenic");
		sc.screen("western");
		
	
		driver.close();
	}
	

}
