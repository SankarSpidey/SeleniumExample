package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		System.out.println(button1.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> number = driver.findElements(By.tagName("iframe"));
		int total = number.size();
		System.out.println("Number of frames is : "+ total);
		
	}

}
