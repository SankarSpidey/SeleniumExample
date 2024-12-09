package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		//Find Position of Button
		WebElement position =  driver.findElement(By.className("ui-button-text"));
		Point xypoint = position.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is : " + xValue + " Y value is : " + yValue);
		
		//Find Color of the Button
		WebElement colorButton = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		String color = colorButton.getCssValue("color");
		System.out.println("Background color is :"+color);	
		
		//Find the Height and Width
		WebElement sizetButton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizetButton.getSize().getHeight();
		int width = sizetButton.getSize().getWidth();
		System.out.println("Height of the Button is :"+ height);
		System.out.println("Width of the Button is : "+ width);
		
		//Home button
		WebElement homeButton = driver.findElement(By.id("j_idt88:j_idt90"));
		homeButton.click();
		
		
	}

}
