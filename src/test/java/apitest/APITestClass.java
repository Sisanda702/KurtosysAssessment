package apitest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

public class APITestClass
{

    @Test
    public void testApi() {

        given()
                .when()
                .get("https://www.kurtosys.com")
                .then()
                .assertThat()
                .statusCode(200)
                .time(lessThan(2000L)) // It's expected to fail when response time is not less than 2 seconds
                .header("Server", containsString("cloudflare"));
    }
}
