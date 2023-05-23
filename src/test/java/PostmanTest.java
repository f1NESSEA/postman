import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
class PostmanTest {

    @Test
    void shouldReturnBody() {
        given()
                .baseUri("https://postman-echo.com")
                .body("POST Raw Text") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("POST Raw Text"))
        ;

    }

}
