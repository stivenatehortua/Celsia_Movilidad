package co.com.reto.app.celsiamovilidad.exceptions;

public class WrongMessage extends AssertionError {

    public WrongMessage(String message, Throwable cause) {
        super(message, cause);
    }
}
