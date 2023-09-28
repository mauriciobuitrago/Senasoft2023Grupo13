package com.co.booking.stepsdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValideRobot;
import tasks.Login;

public class LoginStepsDefinitions {

    @When("^The user enter the gmail on the web page$")
    public void theUserEnterTheGmailOnTheWebPage() throws InterruptedException {
        //OnStage.theActorInTheSpotlight().attemptsTo(Login.login());
        //Thread.sleep(3000);
    }

    @Then("^The user see the home page$")
    public void theUserSeeTheHomePage() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValideRobot.validate(), Matchers.is("¿Eres un robot?")));

    }

}
