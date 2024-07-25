import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GarageRestTest extends FunctionalTest{

    @Test
    public void basicPingTest() {


       
   Response response = (Response) given()
                .baseUri("https://api.example.com")
                .header("Content-Type", "application/json")
                .param("key", "value")
                .when()
                .get("/api/resource")
                .then()
                .statusCode(200);


        JsonPath jsonPathEvaluator = response.jsonPath();
        Assert.assertEquals(jsonPathEvaluator.get("city"),"");



    }

}