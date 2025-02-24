/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.model.Order;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;



import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


/**
 * OpenAPI Petstore
 *
 * <p>This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 */

@RegisterRestClient(configKey="petstore")
@RegisterProvider(ApiExceptionMapper.class)
@Path("/store")
public interface StoreApi  {

    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     */
    @DELETE
    @Path("/order/{orderId}")
    void deleteOrder(@PathParam("orderId") String orderId) throws ApiException, ProcessingException;

    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     */
    @GET
    @Path("/inventory")
    @Produces({ "application/json" })
    Map<String, Integer> getInventory() throws ApiException, ProcessingException;

    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     *
     */
    @GET
    @Path("/order/{orderId}")
    @Produces({ "application/xml", "application/json" })
    Order getOrderById(@PathParam("orderId") Long orderId) throws ApiException, ProcessingException;

    /**
     * Place an order for a pet
     *
     * 
     *
     */
    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    Order placeOrder(Order order) throws ApiException, ProcessingException;
}
