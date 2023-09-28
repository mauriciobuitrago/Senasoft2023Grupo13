package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;
import userinterfaces.RegisterPage;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_SALIR));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        actor.attemptsTo((Enter.theValue("ventasdesalas01@gmail.com").into(LoginPage.TXT_GMAIL)));
        actor.attemptsTo(Click.on(LoginPage.BTN_CONFIRMAR));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo((Enter.theValue("123456789aA").into(LoginPage.TXT_PASSWORD)));
        actor.attemptsTo(Click.on(LoginPage.BTN_INICIO));
    }

    public static Login login(){
        return Tasks.instrumented(Login.class);
    }

}
