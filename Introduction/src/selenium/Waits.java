package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");

		WebElement visibleClick = driver.findElement(By.id("j_idt87:j_idt89"));
		visibleClick.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement visibleButton = driver.findElement(By.id("j_idt87:j_idt90"));
		boolean visibility = visibleButton.isDisplayed();

		System.out.println("Is present " + visibility);

		WebElement invisibleClick = driver.findElement(By.id("j_idt87:j_idt92"));
		WebElement invisibleButton = driver.findElement(By.id("j_idt87:j_idt93"));
		
		invisibleClick.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(invisibleButton));
		
		boolean invisibility = invisibleButton.isDisplayed();

		System.out.println("Is present" + invisibility);

	}

}
