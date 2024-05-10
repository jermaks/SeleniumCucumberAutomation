package com.automation.modules.practice;

import com.automation.utils.helpers.annotations.TestInfo;
import org.testng.annotations.Test;

import static com.automation.constants.componentsconstants.Components.REST;
import static com.automation.constants.componentsconstants.Groups.SMOKE;
import static com.automation.constants.restconstants.RestConstants.REST_URL;
import static com.automation.constants.restconstants.RestConstants.USERS_URI;
import static com.automation.constants.restconstants.UserConstants.UserFirstNames.JANET;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static com.automation.utils.helpers.logger.LoggerHelper.LOGGER;

public class TestRestAssured {

    @Test(groups = {SMOKE})
    @TestInfo(testCaseId = "JIRA-223344", component = REST)
    public void testRestAssured() {
        LOGGER.info("Rest Assured Test: Check First Name");
        given()
                .when()
                .get(REST_URL + USERS_URI + "/2")
                .then()
                .assertThat().body("data.first_name", equalTo(JANET));
    }
}
