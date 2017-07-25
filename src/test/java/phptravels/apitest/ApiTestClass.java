package phptravels.apitest;


import org.junit.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ApiTestClass {

    @Test
    public void apitest() {

        given().baseUri("https://jsonplaceholder.typicode.com").
                when().get("/posts").
                then().assertThat().statusCode(200);



    }
}
