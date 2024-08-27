package Day04_31052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnMyntra {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAjwmYCzBhA6EiwAxFwfgHYImovbQlv_etHan4r4fTNuoOsVOoKCkV6ClbmLcCO0dwIrvuugJBoCDAsQAvD_BwE");
		Thread.sleep(1000);
		
		WebElement women=driver.findElement(By.xpath("//div[@class='desktop-navLinks']/child::div[2]/descendant::a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(women).build().perform();
		Thread.sleep(1000);
		
		
		
		
		driver.close();
	
	}

}
