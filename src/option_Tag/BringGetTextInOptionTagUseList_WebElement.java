package option_Tag;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BringGetTextInOptionTagUseList_WebElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Ehab(QA)\\MyChromeNewWebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/index.html");
		String myTilte = driver.getTitle();
		System.out.println(myTilte);
		
//		String myOptions =driver.findElements(By.tagName("option")).get(2).getText();
//		System.out.println(myOptions);
		
		List<WebElement> myListOption = driver.findElements(By.id("country"));
	
		for(int i = 0 ; i<myListOption.size();i++)
		{
			System.out.println(myListOption.get(i).getText());
			 
		}
		
		List<WebElement> myListOptions = driver.findElements(By.id("Social"));
		
		for(int i = 0 ; i<myListOption.size();i++)
		{
			System.out.println(myListOptions.get(i).getText());
			 
		}
		
		

	}

}
