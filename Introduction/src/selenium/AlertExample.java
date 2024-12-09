package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alertBox = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']//span[@class='ui-button-text ui-c'][normalize-space()='Show']"));
		alertBox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement cancelAlert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']//span[@class='ui-button-text ui-c'][normalize-space()='Show']"));
		cancelAlert.click();
		Thread.sleep(3000);
		Alert cancelalert = driver.switchTo().alert();
		cancelalert.sendKeys("Dhoni");
		cancelalert.accept();
	}

}
