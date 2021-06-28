package pages;

import org.openqa.selenium.WebDriver;
import pages.computerInfoPage.ComputerInfoPage;
import pages.mainPage.MainPage;
import pages.searchResultPage.SearchResultPage;

public class PageContainer {
    public PageContainer(WebDriver driver) {
        mainPage = new MainPage(driver);
        computerInfoPage = new ComputerInfoPage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    public MainPage mainPage;
    public ComputerInfoPage computerInfoPage;
    public SearchResultPage searchResultPage;
}