package com.automation.modules.practice;

import com.automation.entities.models.User;
import com.automation.rest.UserContext;
import com.automation.utils.helpers.annotations.TestInfo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.constants.componentsconstants.Components.REST;
import static com.automation.constants.componentsconstants.Groups.SMOKE;
import static com.automation.constants.restconstants.UserConstants.UserFirstNames.JANET;
import static com.automation.constants.restconstants.UserConstants.UserLastNames.WEAVER;
import static com.automation.utils.helpers.logger.LoggerHelper.LOGGER;
import static org.assertj.core.api.Assertions.assertThat;

public class TestFirstRest implements UserContext {

    private User user;

    @BeforeClass(groups = {SMOKE}, alwaysRun = true)
    public void createPreconditions() {
        LOGGER.info("Preconditions: Test test");
        user = getSingleUser("2");
    }

    @Test(groups = {SMOKE})
    @TestInfo(testCaseId = "JIRA-223344", component = REST)
    public void testCheckFirstAndLastName() {
        LOGGER.info("Step 1: Check first name");
        assertThat(user.getData().getFirst_name())
                .withFailMessage(String.format("User First Name is not %s", JANET))
                .isEqualTo(JANET);

        LOGGER.info("Step 2: Check last name");
        assertThat(user.getData().getLast_name())
                .withFailMessage(String.format("User First Name is not %s", WEAVER))
                .isEqualTo(WEAVER);
    }
}
