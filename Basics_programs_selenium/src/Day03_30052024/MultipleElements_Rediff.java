package Day03_30052024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements_Rediff {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		//Thread.sleep(1000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			String li=links.get(i).getText();
			String url=links.get(i).getAttribute("href");
			/*if(links.startsWith("M")==true) ========================not working
			{*/
			System.out.println(li +" .----->" +url);
		
		}
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		
		if(links.size()> image.size()) {
			System.out.println("links size.."+links.size());
			System.out.println("image size.."+image.size());
			System.out.println("Test cases passed");
		}else {
			System.out.println("links size.."+links.size());
			System.out.println("image size.."+image.size());
			System.out.println("Test cases failed");
		}
		

	}

}
