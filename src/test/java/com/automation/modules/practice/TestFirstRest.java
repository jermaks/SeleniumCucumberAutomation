package com.automation.modules.practice;

import com.automation.entities.models.User;
import com.automation.rest.UserContext;
import org.junit.jupiter.api.Test;

import static com.automation.constants.restconstants.UserConstants.UserFirstNames.JANET;
import static com.automation.constants.restconstants.UserConstants.UserLastNames.WEAVER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFirstRest implements UserContext {

    @Test
    public void testFirstRestTest() {
        User user = getSingleUser("2");
        assertEquals(JANET, user.getData().getFirst_name(), String.format("User First Name is not %s", JANET));
        assertEquals(WEAVER, user.getData().getLast_name(), String.format("User First Name is not %s", WEAVER));
    }
}
