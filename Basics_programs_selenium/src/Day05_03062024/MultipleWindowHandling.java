package Day05_03062024;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/women-ethnic-wear");
		Thread.sleep(1000);

		List<WebElement> ethnic=driver.findElements(By.xpath("//ul[@class='results-base']/descendant::a"));
		
		for(int i=0;i<=5;i++)
		{
			ethnic.get(i).click();
			Thread.sleep(1000);
		}
		Set<String>wind=driver.getWindowHandles();
		System.out.println(wind);
		
		
		Iterator<String> itr= wind.iterator();    //=============iterates to windows==============
		while(itr.hasNext())
		{
			Thread.sleep(1000);
			driver.switchTo().window(itr.next());
			String title=driver.getTitle();
			System.out.println(title);
		}
		
	}

}
