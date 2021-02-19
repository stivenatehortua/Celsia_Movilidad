package co.com.reto.app.celsiamovilidad.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class Swipe implements Interaction {
    private Target target;

    public Swipe(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int mindpointX = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().getWidth() / 2;
        int mindpointY = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().getHeight() / 2;
        int quarterY = mindpointY / 2;

        while (!target.resolveFor(actor).isCurrentlyVisible()) {
            new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver())
                    .press(PointOption.point(mindpointX, mindpointY))
                    .moveTo(PointOption.point(mindpointX, quarterY))
                    .release().perform();

        }
    }

    public static Swipe vertical(Target target) {
        return Tasks.instrumented(Swipe.class, target);
    }
}
