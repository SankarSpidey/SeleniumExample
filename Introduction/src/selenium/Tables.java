package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
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
		System.out.println("Number of rows :" +size);
		
		for (WebElement row : allRows) {
			List<WebElement> colums = row.findElements(By.tagName("td"));
			WebElement firstColumn = colums.get(0);
			System.out.println(firstColumn.getText());
		}			
		
		for (int i = 0 ; i < size; i++) {
			List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(1);
			String text = lastname.getText();
			System.out.println(text);
			if(text.equals("Raj")) {
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}
		}
	}

}
