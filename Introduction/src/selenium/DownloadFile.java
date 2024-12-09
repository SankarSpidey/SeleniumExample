package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement downloadButton = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadButton.click();
		
		File files = new File("C:\\Users\\Sankar siva\\Downloads");
		File[] totalFiles= files.listFiles();
		
		for (File file : totalFiles) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;
			}
		}
		
		
		
	
		

	}

}
