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

package org.openapitools.server.api;

import java.util.Date;
import org.openapitools.server.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import io.smallrye.mutiny.Uni;


import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


/**
 * OpenAPI Petstore
 *
 * <p>This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 */

@RegisterProvider(ApiExceptionMapper.class)
@Path("/user")
public interface UserApi  {

    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    Uni<Void> createUser(User user) throws ApiException, ProcessingException;

    /**
     * Creates list of users with given input array
     *
     * 
     *
     */
    @POST
    @Path("/createWithArray")
    @Consumes({ "application/json" })
    Uni<Void> createUsersWithArrayInput(List<User> user) throws ApiException, ProcessingException;

    /**
     * Creates list of users with given input array
     *
     * 
     *
     */
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    Uni<Void> createUsersWithListInput(List<User> user) throws ApiException, ProcessingException;

    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     */
    @DELETE
    @Path("/{username}")
    Uni<Void> deleteUser(@PathParam("username") String username) throws ApiException, ProcessingException;

    /**
     * Get user by user name
     *
     * 
     *
     */
    @GET
    @Path("/{username}")
    @Produces({ "application/xml", "application/json" })
    Uni<User> getUserByName(@PathParam("username") String username) throws ApiException, ProcessingException;

    /**
     * Logs user into the system
     *
     * 
     *
     */
    @GET
    @Path("/login")
    @Produces({ "application/xml", "application/json" })
    Uni<String> loginUser(@QueryParam("username") String username, @QueryParam("password") String password) throws ApiException, ProcessingException;

    /**
     * Logs out current logged in user session
     *
     * 
     *
     */
    @GET
    @Path("/logout")
    Uni<Void> logoutUser() throws ApiException, ProcessingException;

    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     */
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json" })
    Uni<Void> updateUser(@PathParam("username") String username, User user) throws ApiException, ProcessingException;
}
