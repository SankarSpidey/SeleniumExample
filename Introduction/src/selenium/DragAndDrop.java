package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop"));
		
		Actions action = new Actions(driver);
		// action.clickAndHold(from).moveToElement(to).release().build().perform();
		action.dragAndDrop(from, to).build().perform();
		
		WebElement drag = driver.findElement(By.id("form:conpnl"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 300, 0).build().perform();
		
		

	}

}
