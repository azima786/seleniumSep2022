package test.java.economics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.LandingPage;
import pageObjectModel.ProductCatalog;
import pageObjectModel.confirmationPage;
import pageObjectModel.myCart;
import pageObjectModel.paymentMethod;

public class submitTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String productName = "ZARA COAT 3";
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        LandingPage landing = new LandingPage(driver);
       

landing.goTo();
ProductCatalog productCatalog = landing.loginApplication("ak123@gmail.com", "Abc123456$");
List<WebElement> products = productCatalog.getProductList();
myCart cart = productCatalog.addProductToCart(productName);
Boolean match = cart.clickOnCart(productName);
Assert.assertTrue(match);
paymentMethod payment = cart.checkOutButton();
payment.selectCountryFromDropDown("india");  
confirmationPage confirmPage = payment.clickOnPlaceOrder();
String orderConfirmation =confirmPage.confirmOrderSubmission();
Assert.assertTrue(orderConfirmation.equalsIgnoreCase("Thankyou for the order."));



}
    
}
