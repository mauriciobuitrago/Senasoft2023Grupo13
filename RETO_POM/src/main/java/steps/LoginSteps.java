package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser() {
        loginPage.open();
    }

    @Step
    public void header() {
        loginPage.getDriver().findElement(loginPage.getBTN_HEADER())
                .click();
    }


    @Step
    public void login() {
        loginPage.getDriver().findElement(loginPage.getBTN_LOGGIN())
                .click();

    }

    @Step
    public void gmail() {
        loginPage.getDriver().findElement(loginPage.getTXT_GMAIL())
                .sendKeys("antonygutierrez123456@gmail.com");

    }

    @Step
    public void confirmar() {
        loginPage.getDriver().findElement(loginPage.getBTN_CONFIRMAR())
                .click();
    }

    @Step
    public void password() {
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys("1001994702Aa.");

    }
    @Step
    public  void loggined(){
        loginPage.getDriver().findElement(loginPage.getLOGINNED())
                .click();

    }
    @Step
    public void validate(){
        Assert.assertThat(loginPage.getDriver()
                .findElement(loginPage.getLBL_VALIDATE())
                .isDisplayed(),Matchers.is(false));
    }
}


