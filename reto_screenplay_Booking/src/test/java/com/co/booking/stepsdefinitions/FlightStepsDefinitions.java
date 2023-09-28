package com.co.booking.stepsdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValidationFlight;
import tasks.Flights;

public class FlightStepsDefinitions {

    @When("^The user enters the data to book their flight successfully$")
    public void theUserEntersTheDataToBookTheirFlightSuccessfully() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(Flights.flights());
        Thread.sleep(8000);

    }


    @Then("^The user sees the results of his search$")
    public void theUserSeesTheResultsOfHisSearch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationFlight.validationFlight(), Matchers.is("Filtros")));

    }


}
