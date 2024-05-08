package com.automation.modules.practice;

import com.automation.entities.models.User;
import com.automation.rest.UserContext;
import org.junit.jupiter.api.Test;

import static com.automation.constants.restconstants.UserConstants.UserFirstNames.JANET;
import static com.automation.constants.restconstants.UserConstants.UserLastNames.WEAVER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.automation.utils.helpers.logger.LoggerHelper.LOGGER;

public class TestFirstRest implements UserContext {

    @Test
    public void testFirstRestTest() {
        LOGGER.info("Preconditions: Test test");
        User user = getSingleUser("2");
        LOGGER.info("Step 1: Check first name");
        assertEquals(JANET, user.getData().getFirst_name(), String.format("User First Name is not %s", JANET));
        LOGGER.info("Step 1: Check last name");
        assertEquals(WEAVER, user.getData().getLast_name(), String.format("User First Name is not %s", WEAVER));
    }
}
