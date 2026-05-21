import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class APITestExamples {

    @Test
    public void test_1() {
        Response response = RestAssured.get("https://courseenrollmentapimanagementsystem.onrender.com/status");

//        System.out.println(response.statusCode());
//        System.out.println(response.body().asString());
//        System.out.println(response.time());
//        System.out.println(response.getHeader("Content-Type"));

        int statusCode = response.statusCode();

        assert statusCode == 200 : "Expected status code 200 but got " + statusCode;
    }


    @Test
    public void test_2() {
        baseURI = "https://courseenrollmentapimanagementsystem.onrender.com";

        given().get("/status")
                .then()
                .statusCode(200)
                .body("status", equalTo("Server is running"));
    }

    @Test
    public void test_3(){
        baseURI = "https://courseenrollmentapimanagementsystem.onrender.com";

        given().get("/courses/all")
                .then()
                .statusCode(200)
                .body("_id[5]", equalTo("69d4cd4b51d014471d4162ec"));
    }
}
