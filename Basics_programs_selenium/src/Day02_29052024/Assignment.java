package Day02_29052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
//=======================================FB title and URL============================================
		String title=driver.getTitle();
		int titlelen=title.length();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		int urllen2=url.length();
		System.out.println(url);
		
		if(titlelen>urllen2)
		{
			System.out.println("Title length is greater... test case passed");
		}else {
			System.out.println("Url length is greater... test case failed");
		}
//========================================login avaiable and enable or not==========================================		
		WebElement login=driver.findElement(By.name("login"));
		if(login.isDisplayed()||login.isEnabled()) {
			login.click();
			System.out.println("login is availabe and enable... test case passed");
		}
		else
		{
			System.out.println("login is not availabe and enable... test case failed");
		
		}
		
//============================================forgot password link should not contain account============================
		//String title1= driver.getTitle();
		WebElement pass= driver.findElement(By.linkText("Forgotten password?"));
		pass.click();
		String title1=driver.getTitle();
		System.out.println(title1);
//=====================================search button in forgot password=================================================
		WebElement search=driver.findElement(By.name("did_submit"));
		if(search.isDisplayed()||search.isEnabled()) {
			System.out.println("search button is available... test case pass");
		}
		else
		{
			System.out.println("search button is not available... test case failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
