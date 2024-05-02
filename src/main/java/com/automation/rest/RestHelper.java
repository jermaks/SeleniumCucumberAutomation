package com.automation.rest;

import com.automation.entities.models.UserModel;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

import static com.automation.constants.restconstants.RestConstants.SINGLE_USER_URI;

public class RestHelper {
    public static UserModel getJsonToUser(String id) {
        Client restClient = ClientBuilder.newClient();
        return restClient
                .target(SINGLE_USER_URI)
                .path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
                .get(UserModel.class);
    }
}
