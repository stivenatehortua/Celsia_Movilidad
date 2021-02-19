package co.com.reto.app.celsiamovilidad.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TermsAndConditions {
    private TermsAndConditions(){}
    public static final Target CHECK_ACEPT_TERMS_AND_CONDITIONS = Target.the("Check terms and conditions")
            .located(By.id("checkAceptarTerminos"));
    public static final Target BUTTON_ACEPT_TERMS_AND_CONDITIONS = Target.the("Button terms and conditions")
            .located(By.id("terminos_btn_acepto"));
}
