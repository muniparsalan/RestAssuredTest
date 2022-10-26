import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class DeleteAPet {
    @Test
    public void deleteTest () {
        given().
                get("https://petstore.swagger.io/v2/pet/10").
                then().statusCode(200).
                log().all();

    }

}
