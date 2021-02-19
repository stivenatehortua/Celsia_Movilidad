package co.com.reto.app.celsiamovilidad.task;

import co.com.reto.app.celsiamovilidad.interactions.Swipe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.reto.app.celsiamovilidad.usersinterfaces.Login.BUTTON_REGISTER;
import static co.com.reto.app.celsiamovilidad.usersinterfaces.TermsAndConditions.*;

public class EnterRegister implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BUTTON_REGISTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_REGISTER),
                Swipe.vertical(CHECK_ACEPT_TERMS_AND_CONDITIONS),
                Click.on(CHECK_ACEPT_TERMS_AND_CONDITIONS),
                Click.on(BUTTON_ACEPT_TERMS_AND_CONDITIONS));
    }

    public static EnterRegister enterRegister() {
        return Tasks.instrumented(EnterRegister.class);
    }
}
