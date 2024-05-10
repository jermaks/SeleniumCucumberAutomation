package com.automation.modules.practice;

import org.junit.jupiter.api.Test;

import static com.automation.constants.restconstants.RestConstants.REST_URL;
import static com.automation.constants.restconstants.RestConstants.USERS_URI;
import static com.automation.constants.restconstants.UserConstants.UserFirstNames.JANET;
import static com.automation.utils.helpers.logger.LoggerHelper.LOGGER;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestRestAssured {

    @Test
    public void testRestAssured() {
        LOGGER.info("Rest Assured Test: Check First Name");
        given()
                .when()
                .get(REST_URL + USERS_URI + "/2")
                .then()
                .assertThat().body("data.first_name", equalTo(JANET));
    }
}
