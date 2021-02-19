package bdd.steps;

import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.*;

public class BDDStyleMethod {

    public static void simpleGETPost(String postNumber) {
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/posts/%s", postNumber)).
                then().body("author", CoreMatchers.is("Zan"));


    }

    public static void performContainsCollection() {
        given().contentType(ContentType.JSON).
                when().get("http://localhost:3000/posts/").
                then().body("author", containsInAnyOrder("ZanZubair", "Zan")).statusCode(200);

    }

    public static void performPathParameter() {
        given().contentType(ContentType.JSON).
                with().pathParams("post", 2).
                when().get("http://localhost:3000/posts/{post}").
                then().statusCode(200);

    }

    public static void performQueryParameter() {
        given().contentType(ContentType.JSON).
                queryParam("id",1).
                when().get("http://localhost:3000/posts/").
                then().body("author", hasItem("ZanZubair"));

    }


}
