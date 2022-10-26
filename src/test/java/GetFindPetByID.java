import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetFindPetByID {

    @Test
   public void getTest () {
        given().
       get("https://petstore.swagger.io/v2/pet/2").
        then().statusCode(200).
           log().all();


    }
}
