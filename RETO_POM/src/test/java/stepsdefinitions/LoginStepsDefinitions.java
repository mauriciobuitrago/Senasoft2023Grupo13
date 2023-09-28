package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

public class LoginStepsDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("The user open the web page")
    public void theUserOpenTheWebPage() throws InterruptedException {
        loginSteps.openBrowser();
        Thread.sleep(3000);
    }
    @When("The user enters the credentials")
    public void theUserEntersTheCredentials() throws InterruptedException {

        loginSteps.header();
        loginSteps.login();
        loginSteps.gmail();
        loginSteps.confirmar();
        Thread.sleep(4000);
        loginSteps.password();
        loginSteps.loggined();
        Thread.sleep(4000);
    }
    @Then("The user sees the home page")
    public void theUserSeesTheHomePage() {
        loginSteps.validate();
    }



}
