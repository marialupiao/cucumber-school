package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Person sean;
    private Person lucy;
    private String messageFromSean;

    @Given("Lucy is {int} meter(s) from Sean")
    public void lucy_is_meters_from_sean(int distance) throws Throwable {
        Network network = new Network();
        sean = new Person(network);
        lucy = new Person(network);
        lucy.moveTo(distance);

    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        assertEquals(Collections.singletonList(messageFromSean), lucy.getMessagesHeard());
    }
}
