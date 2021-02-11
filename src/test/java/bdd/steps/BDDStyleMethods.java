package bdd.steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

public class BDDStyleMethods {

    public static void simpleGETMethod(String postNumber){

        when().get(String.format("http://localhost:3000/posts/%s",postNumber)).
                then().body("author", is("ZanZubair"));
    }

    public static void performPathParameter(){

               with().pathParams("post",2).
                   when().get("http://localhost:3000/posts/{post}").
                     then().body("author", is("Zan")).statusCode(200);
    }

    public static void performQueryParameter(){

               with().queryParam("id","1" ).
                   when().get("http://localhost:3000/posts/").
                     then().body("author", hasItem("ZanZubair")).statusCode(200);
    }

}
