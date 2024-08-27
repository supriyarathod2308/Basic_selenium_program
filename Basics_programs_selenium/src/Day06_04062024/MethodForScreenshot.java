package Day06_04062024;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class MethodForScreenshot {
	WebDriver driver;
	
	
	public MethodForScreenshot(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void screen(String nm) throws IOException {
		TakesScreenshot take= (TakesScreenshot) driver; //======bcoz it is upcaste were driver is bigger then screenshot
		File scr=take.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\admin\\Documents\\SOFTWARE TESTING NOTES\\ScreenShots\\"+nm+".jpeg");
																							//ethenic
		FileHandler.copy(scr, dest);
		
		
	}

}
