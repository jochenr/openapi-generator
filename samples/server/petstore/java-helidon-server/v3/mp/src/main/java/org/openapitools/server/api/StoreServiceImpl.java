/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.api;

import java.util.Map;
import org.openapitools.server.model.Order;

import jakarta.ws.rs.*;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/store")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public class StoreServiceImpl implements StoreService {

    @DELETE
    @Path("/order/{order_id}")
    public void deleteOrder(@PathParam("order_id") String orderId) {
    }

    @GET
    @Path("/inventory")
    @Produces({ "application/json" })
    public Map<String, Integer> getInventory() {
        Map<String, Integer> result = java.util.Collections.emptyMap(); // Replace with correct business logic.
        return result;
    }

    @GET
    @Path("/order/{order_id}")
    @Produces({ "application/xml", "application/json" })
    public Order getOrderById(@PathParam("order_id") @Min(1L) @Max(5L) Long orderId) {
        Order result = null; // Replace with correct business logic.
        return result;
    }

    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    public Order placeOrder(@Valid @NotNull Order order) {
        Order result = null; // Replace with correct business logic.
        return result;
    }
}
