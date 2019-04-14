package br.com.ms.quarkus;


import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class MovieResourcesTest {

    @Test
    public void testGetAlllMoviesEndpoint() {
        RestAssured.given()
          .when().get("/movie")
          .then()
             .statusCode(200)
                .assertThat()
                .body("size", Matchers.greaterThan(0))
                .body("[0].name", Matchers.equalTo("The Avengers"))
                .body("[1].name", Matchers.equalTo("Avengers: Age Of Ultron"))
                .body("[2].name", Matchers.equalTo("Avengers: Infinity War"));
    }

}