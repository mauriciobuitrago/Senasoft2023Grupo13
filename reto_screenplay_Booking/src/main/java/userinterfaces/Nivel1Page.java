package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Nivel1Page {

    public static final Target H3_ROBOT = Target.the("comprobamos que este aparezca para hacer su respectiva validacion")
            .locatedBy("//*[text()='¿Eres un robot?']");

}
