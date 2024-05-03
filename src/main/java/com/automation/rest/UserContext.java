package com.automation.rest;

import com.automation.entities.models.User;

import static com.automation.rest.RestHelper.getJsonToUser;

public interface UserContext {

    default User getSingleUser(String id) {
        return getJsonToUser(id);
    }
}
