package co.com.reto.app.celsiamovilidad.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Register {
    private Register(){}
    public static final Target INPUT_NAME = Target.the("Name")
            .located(By.id("input_nombre"));
    public static final Target INPUT_LASTNAME = Target.the("Lastname")
            .located(By.id("input_apellido"));
    public static final Target INPUT_ID = Target.the("Id")
            .located(By.id("input_documento"));
    public static final Target INPUT_PHONE_NUMBER = Target.the("Phone number")
            .located(By.id("input_telefono"));
    public static final Target SELECTOR_CITY = Target.the("Selector City")
            .located(By.id("selector_ciudad"));
    public static final Target FIELD_CITY = Target.the("City")
            .locatedBy("//*[@text='{0}']");
    public static final Target INPUT_ADRESS = Target.the("Adress")
            .located(By.id("input_direccion"));
    public static final Target INPUT_EMAIL = Target.the("Email")
            .located(By.id("input_correo"));
    public static final Target INPUT_PASSWORD = Target.the("Password")
            .located(By.id("input_password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirm password")
            .located(By.id("input_password_confirm"));
    public static final Target BUTTON_REGISTER = Target.the("Register")
            .located(By.id("btn_registrarse"));
}
