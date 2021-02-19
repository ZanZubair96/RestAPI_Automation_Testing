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
    public void iPerformGETOperationFor(String url)  {
        given().contentType(ContentType.JSON);
    }

    @When("^I perform GET from the post number \"([^\"]*)\"$")
    public void iPerformGETFromThePostNumber(String postNumber)  {
        BDDStyleMethod.simpleGETPost(postNumber);
//      when().get(String.format("http://localhost:3000/posts/%s",postNumber)).
//              then().body("author", is("ZanZubair"));
    }

    @Then("^I should see the author name as \"([^\"]*)\"$")
    public void iShouldSeeTheAuthorNameAs(String arg0)  {

    }

    @Then("^I should see the author names$")
    public void iShouldSeeTheAuthorNames() {
        BDDStyleMethod.performContainsCollection();
    }

    @Then("^I should verify the GET PathParameter instance$")
    public void iShouldVerifyTheGETPathParameterInstance() {
        BDDStyleMethod.performPathParameter();
    }

    @Then("^I should verify the GET QueryParameter instance$")
    public void iShouldVerifyTheGETQueryParameterInstance() {
        BDDStyleMethod.performQueryParameter();
    }
}
