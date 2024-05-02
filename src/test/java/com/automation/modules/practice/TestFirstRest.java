package com.automation.modules.practice;

import com.automation.entities.models.UserModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.automation.rest.RestHelper.getJsonToUser;

public class TestFirstRest {

    @Test
    public void testFirstRestTest() {
        UserModel user = getJsonToUser("2");
        Assertions.assertEquals(user.getData().getFirst_name(), "Janet",
                "First Name is not correct");
    }
}
