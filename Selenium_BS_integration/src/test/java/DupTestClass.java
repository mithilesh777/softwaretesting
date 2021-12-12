package test.java;

import org.testng.annotations.Test;

public class DupTestClass extends Base {


    @Test(priority = 2)
    public void test1() throws InterruptedException {
        loginPage.selectThePortalType();
        loginPage.selectTheLoginType();
        loginPage.clickOnUserId();
        loginPage.clickOnPassword();
        loginPage.clickOnSignIn();
    }
}
