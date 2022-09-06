package test.java.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "selenium/target/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com"); //pause until page is fully loaded
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); //will not wait

		

	
	
driver.close();
		
	}
		
}
