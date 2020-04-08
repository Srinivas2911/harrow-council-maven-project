package uk.harrow.gov.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.pages.LoginPage;
import uk.harrow.gov.testbase.TestBase;

public class LoginTest extends TestBase {
HomePage homePage = new HomePage();
LoginPage loginPage = new LoginPage();

@Test
    public void verifyUserIsAbleToNavigatetoLoginPage (){
    homePage.setLoginLink();
    loginPage.setWelcomeGuestText();
    String expectedText = "Welcome Guest!";
    String actualText = loginPage.getWelcomeGuestText();
    Assert.assertEquals(expectedText, actualText);
}
}
