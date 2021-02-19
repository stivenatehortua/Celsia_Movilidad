package co.com.reto.app.celsiamovilidad.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    private Login(){}
    public static final Target BUTTON_REGISTER = Target.the("Register button")
            .located(By.id("loginBtnRegistro"));
}
