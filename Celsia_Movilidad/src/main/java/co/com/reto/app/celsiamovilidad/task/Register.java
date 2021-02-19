package co.com.reto.app.celsiamovilidad.task;

import co.com.reto.app.celsiamovilidad.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.reto.app.celsiamovilidad.usersinterfaces.Register.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Register implements Task {
    private DataUser dataUser;

    public Register(DataUser dataUser) {
        this.dataUser = dataUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_NAME, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataUser.getName()).into(INPUT_NAME),
                Enter.theValue(dataUser.getLastName()).into(INPUT_LASTNAME),
                Enter.theValue(String.valueOf(dataUser.getId())).into(INPUT_ID),
                Enter.theValue(String.valueOf(dataUser.getPhoneNumber())).into(INPUT_PHONE_NUMBER),
                Click.on(SELECTOR_CITY),
                Click.on(FIELD_CITY.of(dataUser.getCity())),
                Enter.theValue(dataUser.getAdress()).into(INPUT_ADRESS),
                Enter.theValue(dataUser.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(dataUser.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(dataUser.getConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(BUTTON_REGISTER));

    }

    public static Register user(DataUser dataUser) {
        return Tasks.instrumented(Register.class, dataUser);
    }
}
