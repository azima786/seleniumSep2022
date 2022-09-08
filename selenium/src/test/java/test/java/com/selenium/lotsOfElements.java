package test.java.com.selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lotsOfElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "selenium/target/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String itemsNeeded[] = { "Cucumber", "Brocolli", "Beetroot", "Beans"};
		int j = itemsNeeded.length;

		Thread.sleep(3000);
		List<WebElement> product = driver.findElements(By.cssSelector(".product-name"));
		for (int i = 0; i < product.size(); i++) {

			List itemsNeededList = Arrays.asList(itemsNeeded);
			String []name = product.get(i).getText().split("-");
			String formattedname = name[0].trim(); 
			System.out.println(formattedname);
		
			if (itemsNeededList.contains(formattedname)) {
				j++;
				Thread.sleep(3000);
				driver.findElements(By.xpath("(//div[@class='product-action']/button)")).get(i).click();
				if (j == 3) {
					break;
				}
			
			}
		}

	}
}