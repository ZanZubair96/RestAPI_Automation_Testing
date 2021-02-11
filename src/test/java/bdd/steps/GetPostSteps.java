package bdd.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class GetPostSteps {
    @Given("^I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String arg0) throws Throwable {
        given().contentType(ContentType.JSON);
    }

    @When("^I perform GET from the post number \"([^\"]*)\"$")
    public void iPerformGETFromThePostNumber(String postNumber) throws Throwable {
       BDDStyleMethods.simpleGETMethod(postNumber);
    }

    @Then("^I should see the author name as \"([^\"]*)\"$")
    public void iShouldSeeTheAuthorNameAs(String authorName) throws Throwable {

    }

    @Then("^I should verify the GET PathParameter instance$")
    public void iShouldVerifyTheGETPathParameterInstance() {
        BDDStyleMethods.performPathParameter();
    }

    @Then("^I should verify the GET QueryParameter instance$")
    public void iShouldVerifyTheGETQueryParameterInstance() {
        BDDStyleMethods.performQueryParameter();
    }
}
