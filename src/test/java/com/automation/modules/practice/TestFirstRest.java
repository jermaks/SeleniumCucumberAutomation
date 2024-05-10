package com.automation.modules.practice;

import com.automation.entities.models.User;
import com.automation.rest.UserContext;
import org.junit.jupiter.api.Test;

import static com.automation.constants.restconstants.UserConstants.UserFirstNames.JANET;
import static com.automation.constants.restconstants.UserConstants.UserLastNames.WEAVER;
import static com.automation.utils.helpers.logger.LoggerHelper.LOGGER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class TestFirstRest implements UserContext {

    private User user;

    @Test
    public void testCheckFirstAndLastName() {
        LOGGER.info("Preconditions: Test test");
        user = getSingleUser("2");

        LOGGER.info("Step 1: Check first name with two fail message options");
        //Assertion with .as()
        assertThat(user.getData().getFirst_name()).as("First Name").isEqualTo(JANET);

        //Assertion with .withFailMessage()
        assertThat(user.getData().getFirst_name())
                .withFailMessage(String.format("User First Name is not %s", JANET))
                .isEqualTo(JANET);

        LOGGER.info("Step 2: Check last name");
        assertThat(user.getData().getLast_name()).as("Last Name").isEqualTo(WEAVER);

        //Soft assertion
        LOGGER.info("Step 3: Check last name and first name with soft assertions");
        assertSoftly(softly -> {
            softly.assertThat(user.getData().getFirst_name()).as("First Name").isEqualTo(JANET);
            softly.assertThat(user.getData().getLast_name()).as("Last Name").isEqualTo(WEAVER);
        });
    }
}
