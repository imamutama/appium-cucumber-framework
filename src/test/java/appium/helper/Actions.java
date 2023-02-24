package appium.helper;

import appium.capabilities.DriverFactoryManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Actions {
    private static AppiumDriver<?> driver;
    private  static WebDriverWait wait;

    public Actions() {
        this.driver = new DriverFactoryManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public static void implicitWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void waitForVisibility(MobileElement e) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public static void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void clear(MobileElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(MobileElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void sendKeys(MobileElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public static void clickByText(String txt) {
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/*//*[@text='" + txt + "']"));
        waitForVisibility(element);
        element.click();
    }

    public void chooseDropdown(MobileElement e, String txt) throws InterruptedException {
        waitForVisibility(e);
        click(e);
        implicitWait();
        clickByText(txt);
    }

    public static void waitVisibilityText(String txt) {
        By element = By.xpath("/*//*[@text='" + txt + "']");
        implicitWait();
        waitForVisibility(element);
    }

    public List<WebElement> waitVisibilityElements(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }


}
