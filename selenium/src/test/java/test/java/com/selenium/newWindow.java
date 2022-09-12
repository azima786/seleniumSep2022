package test.java.com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\azima.keshwani\\Desktop\\selenium\\selenium\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
driver.switchTo().newWindow(WindowType.TAB);
Set<String> windowHandles = driver.getWindowHandles();
Iterator<String> it = windowHandles.iterator();
String parentWindow = it.next();
String childWindow = it.next();
driver.switchTo().window(childWindow);
driver.get("https://rahulshettyacademy.com/");
String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
System.out.println(courseName);

driver.switchTo().window(parentWindow);
driver.findElement(By.name("name")).sendKeys(courseName);


driver.close();
	}
	
}