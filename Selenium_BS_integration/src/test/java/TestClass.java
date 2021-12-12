package test.java;

import org.testng.annotations.*;
public class TestClass extends Base {

    @Test(priority = 1)
    public void test1() throws InterruptedException {
        loginPage.copyTextItem();
        loginPage.selectThePortalType();
        loginPage.selectTheLoginType();
        loginPage.clickOnUserId();
        loginPage.clickOnPassword();
        loginPage.clickOnSignIn();
    }
}
