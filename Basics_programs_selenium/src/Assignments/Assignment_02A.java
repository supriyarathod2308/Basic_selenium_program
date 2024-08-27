package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_02A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		

		List<WebElement> table=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		
				
				System.out.println("Size of the company name:"+table.size());
				
				for(int i=0;i<table.size();i++) {
					String tdata=table.get(i).getText();
					System.out.println("Company----->"  +tdata);
				}

				driver.close();
		}
}
