package com.co.booking.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidacionR;
import tasks.Register;

public class RegisterStepsDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^The user enters the website$")
    public void theUserEntersTheWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
    }

    @When("^The user enter the credentials on the web page$")
    public void theUserEnterTheCredentialsOnTheWebPage() throws InterruptedException {
        //OnStage.theActorInTheSpotlight().attemptsTo(Register.register());
        //Thread.sleep(3000);

    }

    @Then("^The user sees the home page$")
    public void theUserSeesTheHomePage() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionR.validacionRegistro(), Matchers.is("¿Eres un robot?")));
    }

}
