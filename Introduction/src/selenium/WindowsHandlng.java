package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlng {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");

		String oldWindow = driver.getWindowHandle();
		WebElement windows = driver.findElement(By.id("j_idt88:new"));
		windows.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newWindows : handles) {
			driver.switchTo().window(newWindows);
		}

		WebElement click = driver.findElement(By.id("menuform:j_idt39"));
		click.click();
		driver.close();

		driver.switchTo().window(oldWindow);

		WebElement multiple = driver.findElement(By.id("j_idt88:j_idt91"));
		multiple.click();

		int number = driver.getWindowHandles().size();

		System.out.println("Number of windows :" + number);

		WebElement dontClose = driver.findElement(By.id("j_idt88:j_idt93"));
		dontClose.click();

		Set<String> newWindows = driver.getWindowHandles();

		for (String allWindow : newWindows) {
			if (!allWindow.equals(oldWindow)) {
				driver.switchTo().window(allWindow);
				driver.close();
			}
		}

	}

}
