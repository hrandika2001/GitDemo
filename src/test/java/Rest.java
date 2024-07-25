import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
//import io.restassured.response.Response;

//import static io.restassured.RestAssured;
//import static io.restassured.RestAssured.given;

public class Rest {
    @Test
    public void RandikaTest(){




    }

    //base URI - Base URi of the rest api
    //request specification - used to construct the request it includes headers method body etc.
    //Validation.


    //Response response = given().when().get("URL");
   // Response response = given().when().get("URL");




    // Method Chaining means we can amalgamate no of methods in to a single line.
    // Variables are not needed to hold the interim results retrun from each and every method.

    //given sets up preconditions , When sets up the http method , Then usesrs to asserts the valuds and for the validations.

    Response response1  = (Response) given().pathParam("ID", 1)
    .baseUri("https://api.example.com")
    .auth().basic("username", "password")
.when()
    .get("/api/resource/{ID}")
.then()
    .statusCode(200);




}
