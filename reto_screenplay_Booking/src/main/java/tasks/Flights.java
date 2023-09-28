package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.apache.fontbox.cff.CFFOperator;
import userinterfaces.FlightsPage;

public class Flights implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FlightsPage.BTN_SALIR));
        actor.attemptsTo(Click.on(FlightsPage.BTN_FLIGHTS));
        //actor.attemptsTo(Click.on(FlightsPage.BTN_PLACES));
        actor.attemptsTo(Click.on(FlightsPage.BTN_DESTINATION));
        actor.attemptsTo(Enter.theValue("Barranquilla").into(FlightsPage.TXT_CITY));
        actor.attemptsTo(Click.on(FlightsPage.BTN_SELETION));

        actor.attemptsTo(Click.on(FlightsPage.BTN_DATE));
        actor.attemptsTo(Click.on(FlightsPage.DATE_START));
        actor.attemptsTo(Click.on(FlightsPage.DATE_END));
        actor.attemptsTo(Click.on(FlightsPage.BTN_CONSULT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static Flights flights(){
        return Tasks.instrumented(Flights.class);
    }
}
