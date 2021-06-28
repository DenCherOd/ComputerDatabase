package pages.mainPage;

import common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends CommonPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By addButton = By.xpath("//a[@class='btn success']");
    private final By search = By.xpath("//input[@id='searchbox']");
    private final By submitButton = By.xpath("//input[@id='searchsubmit']");

    public void openMainPage() {
        System.out.println("Opening Main page");
        driver.get("http://computer-database.gatling.io/computers");
    }

    public void clickTheButton() {
        waitForVisible(addButton);
        driver.findElement(addButton).click();
    }

    public void searchForComputer(String computerName) {
        waitForVisible(search);
        driver.findElement(search).sendKeys(computerName);
        driver.findElement(submitButton).click();
    }
}
