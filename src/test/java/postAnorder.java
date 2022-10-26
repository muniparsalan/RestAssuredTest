
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class postAnorder {
    @Test
    public void postTest() {
        given().
                get("https://petstore.swagger.io/v2/store/order").
                then().statusCode(200).
                log().all();
    }


}
