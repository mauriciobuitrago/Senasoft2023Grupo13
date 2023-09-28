package tasks;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.RegisterPage;

public class Register implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_SALIR));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));
        actor.attemptsTo(Enter.theValue("ventasdesalas02@gmail.com").into(RegisterPage.TXT_GMAIL));
        actor.attemptsTo(Click.on(RegisterPage.BTN_CONTINUAR));
        actor.attemptsTo(Enter.theValue("123456789aA").into(RegisterPage.TEXT_NEWPASSWORD));
        actor.attemptsTo(Enter.theValue("123456789aA").into(RegisterPage.TEXT_CONFIRMEDPASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.BTN_CREATEACOUNT));
    }

    public static Register register(){
        return Tasks.instrumented(Register.class);
    }
}
