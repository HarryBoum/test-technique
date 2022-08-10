package com.hugo;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.jetty.server.Server;
import jakarta.ws.rs.client.WebTarget;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeResourceTest {

    private static Server server;
    private static WebTarget target;

    @BeforeAll
    public static void beforeAllTests() {
        server = MainApp.startServer();
        Client c = ClientBuilder.newClient();
        target = c.target(MainApp.BASE_URI);
    }

    @AfterAll
    public static void afterAllTests() throws Exception {
        server.stop();
    }

}
