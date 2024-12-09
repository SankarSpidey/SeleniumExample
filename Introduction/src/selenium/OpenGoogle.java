package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);
		}
		
		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
		int size = allRows.size();
		System.out.println("Number of rows ;"+size);
		
		for (WebElement row : allRows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			WebElement firstName = columns.get(0);
			System.out.println(firstName.getText());
		}
		
		for(int i=0; i <size; i++) {
			List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
			WebElement lastName = rows.get(1);
			String text = lastName.getText();
			System.out.println(text);
			if(text.equals("Chatterjee")) {
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}
		}
		
		
		
	}
	
		
		
		
		
		

		
	}
		
		
		
		
		
		


