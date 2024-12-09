package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0lgwcqibnnvlexyujv4hi6nt0583649.node0");
		WebElement textBox = driver.findElement(By.id("j_idt88:name"));
		textBox.sendKeys("Dhoni");
		WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
		appendText.sendKeys("India");
		
		WebElement verifyTextBox = driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean enabled = verifyTextBox.isEnabled();
		System.out.println(enabled);
		
		WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearText.clear();
		
		WebElement retrieveText = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = retrieveText.getAttribute("value");
		System.out.println(text);
	}

}
