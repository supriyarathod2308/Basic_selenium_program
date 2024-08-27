package Day04_31052024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("gender-male")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB);
		act.sendKeys("supriya");
		act.sendKeys(Keys.TAB);
		act.sendKeys("rathod");
		act.sendKeys(Keys.TAB);
		act.sendKeys("supriya123@gmail.com");
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		

	}

}
