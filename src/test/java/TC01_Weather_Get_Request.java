import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_Weather_Get_Request {

    @Test
    void getWeatherDetails() {
        String key = Constants.API_KEY;

        //base URL
        RestAssured.baseURI = "http://api.weatherapi.com/v1";

        //Specify Request object
        RequestSpecification httpRequest = RestAssured.given();

        // Response object
        Response response = httpRequest.request(Method.GET, "/current.json?key="+key+"&q=London");

        // Json to String
        String responseBody = response.getBody().asString();
        System.out.println("This is the response Body" + responseBody);

        //Status code verification
        int statusCode = response.getStatusCode();
        System.out.println("The Status code is >>>>   " + statusCode);
        Assert.assertEquals(statusCode, 200);

        //status line verification
        String statusLine=response.getStatusLine();
        System.out.println("Status line is:"+statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
    }
}
