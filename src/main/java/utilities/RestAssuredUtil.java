package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestAssuredUtil {

    public static RequestSpecification request;

    public RestAssuredUtil(){
        //Arrange
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("http://localhost:3000");
        builder.setContentType(ContentType.JSON);
        request = RestAssured.given().spec(builder.build());

    }
    public static void getOptions(String url) {
        //Action
        request.get(url);
    }

    public static void getOptionsWithPathParameter(String url, Map<String, String> pathParams) {
        //Action
        request.pathParams(pathParams);
        request.get(url);
    }
}
