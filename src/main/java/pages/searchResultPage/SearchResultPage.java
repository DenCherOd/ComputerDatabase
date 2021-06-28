package pages.searchResultPage;

import common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchResultPage extends CommonPage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void computerPresence(String computerName) {
        By computer = By.xpath("//*[text()='" + computerName + "']");
        Assert.assertTrue(waitForVisible(computer), "Can not find computer with name " + computerName);
    }
}
