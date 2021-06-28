package tests;

import common.CommonTest;
import org.testng.annotations.Test;

public class ComputerDatabaseTest extends CommonTest{

    @Test
    public void addComputerTest() {
        String computerName = "Vinga";

        System.out.println("Step 1. Open main page and click the 'Add a new computer' button");
        pages.mainPage.openMainPage();
        pages.mainPage.clickTheButton();

        System.out.println("Step 2. Fill the inputs and click the button");
        pages.computerInfoPage.createComputer(computerName);

        System.out.println("Step 3. Check the presence of the created computer");
        pages.mainPage.searchForComputer(computerName);
        pages.searchResultPage.computerPresence(computerName);
    }

    @Test
    public void searchFunctionality() {
        String computerName = "Mac Mini";

        System.out.println("Step 1. Open main page and search for " + computerName);
        pages.mainPage.openMainPage();
        pages.mainPage.searchForComputer(computerName);

        System.out.println("Step 2. Check the presence of the computer on the search page");
        pages.searchResultPage.computerPresence(computerName);
    }
}