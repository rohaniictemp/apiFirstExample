/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-25T11:47:48.424368300-07:00[America/Vancouver]")
@Validated
@Tag(name = "login2", description = "the login2 API")
@RequestMapping("${openapi.login.base-path:}")
public interface Login2Api {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /login2
     * Auto generated using Swagger Inspector
     *
     * @param password  (optional)
     * @param email  (optional)
     * @return Auto generated using Swagger Inspector (status code 200)
     */
    @Operation(
        operationId = "login2Get",
        responses = {
            @ApiResponse(responseCode = "200", description = "Auto generated using Swagger Inspector")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/login2"
    )
    default ResponseEntity<Void> login2Get(
        @Parameter(name = "password", description = "") @Valid @RequestParam(value = "password", required = false) String password,
        @Parameter(name = "email", description = "") @Valid @RequestParam(value = "email", required = false) String email
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
