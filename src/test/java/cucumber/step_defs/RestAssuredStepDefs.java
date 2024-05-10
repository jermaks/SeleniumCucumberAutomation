package cucumber.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.assertj.core.api.Assertions.assertThat;

import static com.automation.utils.helpers.logger.LoggerHelper.LOGGER;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredStepDefs {

    private static Response response;

    @Given("I get the user {int}")
    public void iGetTheUser(int id) {
        LOGGER.info("Cucumber step 1: Given I get the user 2");
        RestAssured.baseURI = "https://reqres.in/api";
        RequestSpecification request = RestAssured.given();
        response = request.get("/users/" + id);
        assertThat(200).isEqualTo(response.getStatusCode());
    }

    @When("I get users First Name")
    public void iGetUsersFirstName() {
        LOGGER.info("Cucumber step 2");
        response.then().assertThat().body("data.first_name", equalTo("Janet"));
    }

    @Then("I verify users First Name")
    public void iVerifyUsersFirstName() {
        LOGGER.info("Cucumber step 3");
    }
}
