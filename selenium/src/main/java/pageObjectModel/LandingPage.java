package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.abstractComponent;



public class LandingPage extends abstractComponent {
WebDriver driver;

    public LandingPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

 //   WebElement UserEmail = driver.findElement(By.id("userEmail"));

    //PageFactory
@FindBy(id="userEmail") WebElement userEmail;
@FindBy(id="userPassword") WebElement password;
@FindBy(id="login") WebElement loginButton;


public ProductCatalog loginApplication(String email, String Password){
userEmail.sendKeys(email);
password.sendKeys(Password);
loginButton.click();
return new ProductCatalog(driver);

}

public void goTo(){
    driver.get("https://rahulshettyacademy.com/client");
}

}
