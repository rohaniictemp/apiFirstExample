/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.UUID;
import org.openapitools.model.User;
import org.openapitools.model.UserWithId;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-06T13:14:03.551847800-07:00[America/Vancouver]")
@Validated
@Tag(name = "user", description = "the user API")
@RequestMapping("${openapi.aPIFIRSTDOCUMENTATION.base-path:}")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /user/{id} : Delete user by id
     *
     * @param id Order ID (required)
     * @return successful operation (status code 204)
     *         or Invalid ID supplied (status code 400)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "deleteById",
        summary = "Delete user by id",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "204", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Not found")
        },
        security = {
            @SecurityRequirement(name = "BasicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{id}"
    )
    default ResponseEntity<Void> deleteById(
        @Parameter(name = "id", description = "Order ID", required = true) @PathVariable("id") UUID id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{id} : Get user by id
     *
     * @param id  (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "getById",
        summary = "Get user by id",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserWithId.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Not found")
        },
        security = {
            @SecurityRequirement(name = "BasicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserWithId> getById(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") UUID id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user : Get all users
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getUsers",
        summary = "Get all users",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserWithId.class))
            })
        },
        security = {
            @SecurityRequirement(name = "BasicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user",
        produces = { "application/json" }
    )
    default ResponseEntity<UserWithId> getUsers(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{id} : Update user information
     *
     * @param id  (required)
     * @param body  (required)
     * @return successful operation (status code 204)
     *         or Invalid ID supplied (status code 400)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "patchUser",
        summary = "Update user information",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "204", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Not found")
        },
        security = {
            @SecurityRequirement(name = "BasicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> patchUser(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") UUID id,
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody User body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user : Insert a new user
     *
     * @param body  (required)
     * @return Created (status code 201)
     *         or An error happen on validation (status code 400)
     *         or E- mail already exists (status code 409)
     */
    @Operation(
        operationId = "postUser",
        summary = "Insert a new user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "400", description = "An error happen on validation"),
            @ApiResponse(responseCode = "409", description = "E- mail already exists")
        },
        security = {
            @SecurityRequirement(name = "BasicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> postUser(
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody User body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
