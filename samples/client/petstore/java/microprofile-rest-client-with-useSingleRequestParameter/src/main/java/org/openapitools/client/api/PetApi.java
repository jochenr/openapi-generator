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

import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.Pet;

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
@Path("/pet")
public interface PetApi  {

    /**
     * Add a new pet to the store
     *
     * 
     *
     */
    @POST
    
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/xml", "application/json" })
    Pet addPet(Pet pet) throws ApiException, ProcessingException;

    /**
     * Deletes a pet
     *
     * 
     *
     */
    @DELETE
    @Path("/{petId}")
    void deletePet(@BeanParam DeletePetRequest request) throws ApiException, ProcessingException;
    public class DeletePetRequest {

        private @HeaderParam("api_key")  String apiKey;
        private @PathParam("petId") Long petId;

        private DeletePetRequest() {
        }

        public static DeletePetRequest newInstance() {
            return new DeletePetRequest();
        }

        /**
         * Set petId
         * @param petId Pet id to delete (required)
         * @return DeletePetRequest
         */
        public DeletePetRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }
        /**
         * Set apiKey
         * @param apiKey  (optional)
         * @return DeletePetRequest
         */
        public DeletePetRequest apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
    }

    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     */
    @GET
    @Path("/findByStatus")
    @Produces({ "application/xml", "application/json" })
    List<Pet> findPetsByStatus(@BeanParam FindPetsByStatusRequest request) throws ApiException, ProcessingException;
    public class FindPetsByStatusRequest {

        private @QueryParam("status") List<String> status;

        private FindPetsByStatusRequest() {
        }

        public static FindPetsByStatusRequest newInstance() {
            return new FindPetsByStatusRequest();
        }

        /**
         * Set status
         * @param status Status values that need to be considered for filter (required)
         * @return FindPetsByStatusRequest
         */
        public FindPetsByStatusRequest status(List<String> status) {
            this.status = status;
            return this;
        }
    }

    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @deprecated
     */
    @Deprecated
    @GET
    @Path("/findByTags")
    @Produces({ "application/xml", "application/json" })
    List<Pet> findPetsByTags(@BeanParam FindPetsByTagsRequest request) throws ApiException, ProcessingException;
    public class FindPetsByTagsRequest {

        private @QueryParam("tags") List<String> tags;

        private FindPetsByTagsRequest() {
        }

        public static FindPetsByTagsRequest newInstance() {
            return new FindPetsByTagsRequest();
        }

        /**
         * Set tags
         * @param tags Tags to filter by (required)
         * @return FindPetsByTagsRequest
         */
        public FindPetsByTagsRequest tags(List<String> tags) {
            this.tags = tags;
            return this;
        }
    }

    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     */
    @GET
    @Path("/{petId}")
    @Produces({ "application/xml", "application/json" })
    Pet getPetById(@BeanParam GetPetByIdRequest request) throws ApiException, ProcessingException;
    public class GetPetByIdRequest {

        private @PathParam("petId") Long petId;

        private GetPetByIdRequest() {
        }

        public static GetPetByIdRequest newInstance() {
            return new GetPetByIdRequest();
        }

        /**
         * Set petId
         * @param petId ID of pet to return (required)
         * @return GetPetByIdRequest
         */
        public GetPetByIdRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }
    }

    /**
     * Update an existing pet
     *
     * 
     *
     */
    @PUT
    
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/xml", "application/json" })
    Pet updatePet(Pet pet) throws ApiException, ProcessingException;

    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     */
    @POST
    @Path("/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    void updatePetWithForm(@BeanParam UpdatePetWithFormRequest request) throws ApiException, ProcessingException;
    public class UpdatePetWithFormRequest {

        private @PathParam("petId") Long petId;
        private @FormParam("name")  String name;
        private @FormParam("status")  String status;

        private UpdatePetWithFormRequest() {
        }

        public static UpdatePetWithFormRequest newInstance() {
            return new UpdatePetWithFormRequest();
        }

        /**
         * Set petId
         * @param petId ID of pet that needs to be updated (required)
         * @return UpdatePetWithFormRequest
         */
        public UpdatePetWithFormRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }
        /**
         * Set name
         * @param name Updated name of the pet (optional)
         * @return UpdatePetWithFormRequest
         */
        public UpdatePetWithFormRequest name(String name) {
            this.name = name;
            return this;
        }
        /**
         * Set status
         * @param status Updated status of the pet (optional)
         * @return UpdatePetWithFormRequest
         */
        public UpdatePetWithFormRequest status(String status) {
            this.status = status;
            return this;
        }
    }

    /**
     * uploads an image
     *
     * 
     *
     */
    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    ModelApiResponse uploadFile(@BeanParam UploadFileRequest request) throws ApiException, ProcessingException;
    public class UploadFileRequest {

        private @PathParam("petId") Long petId;
        private @FormParam("additionalMetadata")  String additionalMetadata;
        private  @FormParam("file") File _fileDetail;

        private UploadFileRequest() {
        }

        public static UploadFileRequest newInstance() {
            return new UploadFileRequest();
        }

        /**
         * Set petId
         * @param petId ID of pet to update (required)
         * @return UploadFileRequest
         */
        public UploadFileRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }
        /**
         * Set additionalMetadata
         * @param additionalMetadata Additional data to pass to server (optional)
         * @return UploadFileRequest
         */
        public UploadFileRequest additionalMetadata(String additionalMetadata) {
            this.additionalMetadata = additionalMetadata;
            return this;
        }
        /**
         * Set _fileDetail
         * @param _fileDetail file to upload (optional)
         * @return UploadFileRequest
         */
        public UploadFileRequest _fileDetail( Attachment _fileDetail) {
            this._fileDetail = _fileDetail;
            return this;
        }
    }
}
