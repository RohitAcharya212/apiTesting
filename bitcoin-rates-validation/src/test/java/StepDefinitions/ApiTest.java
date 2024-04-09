package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class stepDefinitions {

    @Given("a GET request is made to the coinbase api")
    public void performGETRequest() {
        baseURI = "https://api.example.com/bitcoin/rates";
        given().get();
    }

    @Then("a HTTP status code {int} is returned")
    public void verifyStatusCode(int statusCode) {
        then().statusCode(statusCode);
    }

    @And("the response content type should be {string}")
    public void verifyContentType(String contentType) {
        then().contentType(contentType);
    }

    @And("the currency should be Bitcoin")
    public void verifyContentType(String contentType) {
        then().contentType(contentType);
    }

    @And("the rates for currency {string} are not null")
    public void verifyContentType(String contentType) {
        then().contentType(contentType);
    }
}

