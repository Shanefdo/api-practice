import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class APITestExamples {

    @Test
    public void test_1(){
       Response response = RestAssured.get("https://courseenrollmentapimanagementsystem.onrender.com/status");

//        System.out.println(response.statusCode());
//        System.out.println(response.body().asString());
//        System.out.println(response.time());
//        System.out.println(response.getHeader("Content-Type"));

        int statusCode = response.statusCode();

        assert statusCode == 200 : "Expected status code 200 but got " + statusCode;
    }
}
