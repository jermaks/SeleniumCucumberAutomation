package com.automation.rest;

import com.automation.entities.models.User;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

import static com.automation.constants.restconstants.RestConstants.REST_URL;
import static com.automation.constants.restconstants.RestConstants.USERS_URI;

public class RestHelper {

    public static User getJsonToUser(String id) {
        Client restClient = ClientBuilder.newClient();
        return restClient
                .target(REST_URL + USERS_URI)
                .path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
                .get(User.class);
    }
}
