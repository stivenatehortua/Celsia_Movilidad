package co.com.reto.app.celsiamovilidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.reto.app.celsiamovilidad.usersinterfaces.SuccessfulRegistration.TXT_SUCCESSFUL_REGISTRATION_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidateSuccessRegistration implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TXT_SUCCESSFUL_REGISTRATION_MESSAGE, isVisible()).forNoMoreThan(20).seconds());
        return Text.of(TXT_SUCCESSFUL_REGISTRATION_MESSAGE).viewedBy(actor).asString().replace("\n", " ").trim();
    }

    public static ValidateSuccessRegistration successRegistrationMessage() {
        return new ValidateSuccessRegistration();
    }
}
