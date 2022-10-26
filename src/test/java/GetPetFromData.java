import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPetFromData {

    @Test
    public void postTest() {
        given().
                get("https://petstore.swagger.io/v2/pet/3").
                then().statusCode(200).
                log().all();



    }
}
