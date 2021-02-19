package co.com.reto.app.celsiamovilidad.stepdefinitions;

import co.com.reto.app.celsiamovilidad.exceptions.WrongMessage;
import co.com.reto.app.celsiamovilidad.models.DataUser;
import co.com.reto.app.celsiamovilidad.task.Register;
import co.com.reto.app.celsiamovilidad.utils.DriverMobile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import java.util.List;

import static co.com.reto.app.celsiamovilidad.questions.ValidateSuccessRegistration.*;
import static co.com.reto.app.celsiamovilidad.task.EnterRegister.*;
import static co.com.reto.app.celsiamovilidad.utils.constants.ExceptionsConstants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class RegiterStepDefinition {

    @Before
    public void initialSetup() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverMobile.whitCelsiaMovilidad())));
        theActorCalled("the user");
    }

    @Given("^the user is in the registration module$")
    public void theUserIsInTheRegistrationModule() {
        theActorInTheSpotlight().wasAbleTo(enterRegister());
    }

    @When("^the user complete the register$")
    public void theUserCompleteTheRegister(List<DataUser> dataUser) {
        theActorInTheSpotlight().attemptsTo(Register.user(dataUser.get(0)));
    }

    @Then("^the user see the message: (.*)$")
    public void thenTheUserSeeTheMessageBienvenidoALaAppCelsiaMovilidadSostenible(String message) {
        theActorInTheSpotlight().should(seeThat(successRegistrationMessage(), is(equalTo(message)))
                .orComplainWith(WrongMessage.class, MESSAGE_ERROR));
    }
}
