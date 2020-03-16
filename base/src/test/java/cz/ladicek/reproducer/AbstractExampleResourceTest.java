package cz.ladicek.reproducer;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public abstract class AbstractExampleResourceTest {
    @Test
    public void test() {
        System.out.println("!!!!!!!!!! RestAssured:                 " + RestAssured.class.getClassLoader());
        System.out.println("!!!!!!!!!! AbstractExampleResourceTest: " + AbstractExampleResourceTest.class.getClassLoader());
        System.out.println("!!!!!!!!!! this test class:             " + this.getClass().getClassLoader());

        when()
                .get("/example")
        .then()
                .statusCode(200)
                .body(equalTo("Hello, world!"));
    }
}
