package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement homeLink = driver.findElement(By.partialLinkText("Go to"));
		homeLink.click();
		
		driver.navigate().back();
		
		WebElement find = driver.findElement(By.partialLinkText("Find the URL"));
		String destination = find.getAttribute("href");
		System.out.println("Destination Link is "+ destination);
		
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Link is broken!");
		}
		
		driver.navigate().back();
		
		WebElement homeLink2 = driver.findElement(By.partialLinkText("Go to"));
		homeLink2.click();
		
		driver.navigate().back();
		
		List<WebElement> totallinks =driver.findElements(By.tagName("a"));
		int count = totallinks.size();
		System.out.println("Number of Link is "+ count);
	}

}
