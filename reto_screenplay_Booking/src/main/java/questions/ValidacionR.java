package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.Nivel1Page;

public class ValidacionR implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(Nivel1Page.H3_ROBOT).viewedBy(actor).asString();
    }

    public static ValidacionR validacionRegistro(){
        return new ValidacionR();
    }
}
