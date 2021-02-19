package co.com.reto.app.celsiamovilidad.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessfulRegistration {
    private SuccessfulRegistration(){}

    public static final Target TXT_SUCCESSFUL_REGISTRATION_MESSAGE =
            Target.the("Successful registration message")
            .located(By.id("tutorial_text"));
}
