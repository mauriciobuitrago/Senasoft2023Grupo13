package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.VFlights;

public class ValidationFlight implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(VFlights.H2_VALIDATIONFLIGHTS).viewedBy(actor).asString();
    }

    public static ValidationFlight validationFlight(){
        return new ValidationFlight();
    }

}
