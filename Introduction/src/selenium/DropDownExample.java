package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select selectCurrency = new Select(staticDropdown);
		selectCurrency.selectByIndex(2);
		Thread.sleep(3000);
		selectCurrency.selectByVisibleText("USD");
		
		WebElement passengersDropdown = driver.findElement(By.id("divpaxinfo"));
		passengersDropdown.click();
		Thread.sleep(2000);
		WebElement addAdult = driver.findElement(By.id("hrefIncAdt"));
		/*
		 * int i=1; while(i<5){ addAdult.click(); i++; }
		 */
		
		for(int i=1; i<5 ; i++) {
			addAdult.click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		//Auto Suggestive Dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India"));
			{
				Actions actions = new Actions(driver);
				actions.moveToElement(option).click().build().perform();
				break;
			}
		}
	}
}
