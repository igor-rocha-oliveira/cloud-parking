package one.digitalinovation.parking.controller;

import io.restassured.RestAssured;
import one.digitalinovation.parking.controller.dto.ParkingCreateDto;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerTest {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUptest(){
        RestAssured.port = randomPort;
    }

    @Test
    void whenFindAllThenCheckResult() {

        RestAssured.given()
                .when()
                .get("/parking")
                .then()
                .statusCode(HttpStatus.OK.value());
    }

    @Test
    void whenCreateThenCheckIsCreated(){

        var createDTO = new ParkingCreateDto();
        createDTO.setColor("AMARELO");
        createDTO.setLicence("WRT-5555");
        createDTO.setModel("BRASILIA");
        createDTO.setState("SP");

        RestAssured.given()
                .when()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(createDTO)
                .post("/parking")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("licence", Matchers.equalTo("WRT-5555"))
                .body ("color", Matchers.equalTo("AZUL"));

    }
}