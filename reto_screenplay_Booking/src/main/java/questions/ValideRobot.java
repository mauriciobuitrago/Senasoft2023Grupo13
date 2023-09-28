package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomePage;

public class ValideRobot implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.H3_ROBOT).viewedBy(actor).asString();
    }

    public static ValideRobot validate(){
        return new ValideRobot();
    }
}
