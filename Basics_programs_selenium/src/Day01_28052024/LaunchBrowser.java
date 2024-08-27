package Day01_28052024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//launch application
		driver.get("https://www.google.co.in/");
		
		//launch manage
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();				// close one tab in browser
		driver.quit();              // close whole browser
	}

}
