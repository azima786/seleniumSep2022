package test.java.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class disabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "selenium/target/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //pause until page is fully loaded
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //Will return false
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(3000);
			System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());


		//common to all checkboxes - get comman locator and make sure all are selected
	
		int size = (driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(size, 6);

		
	

		driver.close();
	}
		
}
