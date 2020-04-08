package uk.harrow.gov.testsuite;

import org.testng.annotations.Test;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.testbase.TestBase;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyHarrowCouncilLogoIsDisplayed(){
    homePage.setIconDisplay();
    }

    @Test
    public void verifyLoginLinkIsDisplayed(){
        homePage.loginLinkDisplayed();
    }
    @Test
    public void verifyServicesLinkIsDisplayed (){
        homePage.servicesLinkDisplayed();
    }
}
