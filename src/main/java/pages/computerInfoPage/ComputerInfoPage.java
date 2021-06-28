package pages.computerInfoPage;

import common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ComputerInfoPage extends CommonPage {
    public ComputerInfoPage(WebDriver driver) {
        super(driver);
    }

    private Select select;
    private final By addComputerForm = By.xpath("//form");
    private final By computerNameInput = By.xpath("//input[@id='name']");
    private final By introducedInput = By.xpath("//input[@id='introduced']");
    private final By discontinuedInput = By.xpath("//input[@id='discontinued']");
    private final By companySelect = By.xpath("//select[@id='company']");
    private final By submitButton = By.xpath("//input[@type='submit']");

    public void createComputer(String computerName) {
        waitForVisible(addComputerForm);
        driver.findElement(computerNameInput).sendKeys(computerName);
        driver.findElement(introducedInput).sendKeys("2011-06-25");
        driver.findElement(discontinuedInput).sendKeys("2021-06-25");
        select = new Select(driver.findElement(companySelect));
        select.selectByVisibleText("Sony");
        driver.findElement(submitButton).click();
    }
}
