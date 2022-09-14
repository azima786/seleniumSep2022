package abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractComponent {

    WebDriver driver;

    public abstractComponent(WebDriver driver) {
this.driver = driver;
    }

    @FindBy(css="[routerlink*='cart']") WebElement cartHeader;

    public void waitForElementToAppear(By FindBy){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
    }

    public void goToCart(){
cartHeader.click();
    }

    public void waitForElementToDisappear(WebElement spinner){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.invisibilityOf(spinner));

}
}