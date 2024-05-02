package com.automation.rest;

import com.automation.entities.models.UserModel;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class RestHelper {

    private static final String REST_URI = "https://reqres.in/api/users";

    public static UserModel getJsonToUser(String id) {
        Client restClient = ClientBuilder.newClient();
        return restClient
                .target(REST_URI)
                .path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
                .get(UserModel.class);
    }

    public static UserModel jsonToUser(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, UserModel.class);
    }
}
