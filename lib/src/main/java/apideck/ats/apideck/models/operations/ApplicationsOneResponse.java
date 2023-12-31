/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ApplicationsOneResponse {
    /**
     * Bad Request
     */
    
    public apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse;

    public ApplicationsOneResponse withBadRequestResponse(apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse) {
        this.badRequestResponse = badRequestResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ApplicationsOneResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Applications
     */
    
    public apideck.ats.apideck.models.shared.GetApplicationResponse getApplicationResponse;

    public ApplicationsOneResponse withGetApplicationResponse(apideck.ats.apideck.models.shared.GetApplicationResponse getApplicationResponse) {
        this.getApplicationResponse = getApplicationResponse;
        return this;
    }
    
    /**
     * The specified resource was not found
     */
    
    public apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse;

    public ApplicationsOneResponse withNotFoundResponse(apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse) {
        this.notFoundResponse = notFoundResponse;
        return this;
    }
    
    /**
     * Payment Required
     */
    
    public apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse;

    public ApplicationsOneResponse withPaymentRequiredResponse(apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse) {
        this.paymentRequiredResponse = paymentRequiredResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ApplicationsOneResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ApplicationsOneResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Unauthorized
     */
    
    public apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse;

    public ApplicationsOneResponse withUnauthorizedResponse(apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse) {
        this.unauthorizedResponse = unauthorizedResponse;
        return this;
    }
    
    /**
     * Unexpected error
     */
    
    public apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse;

    public ApplicationsOneResponse withUnexpectedErrorResponse(apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse) {
        this.unexpectedErrorResponse = unexpectedErrorResponse;
        return this;
    }
    
    /**
     * Unprocessable
     */
    
    public apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse;

    public ApplicationsOneResponse withUnprocessableResponse(apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse) {
        this.unprocessableResponse = unprocessableResponse;
        return this;
    }
    
    public ApplicationsOneResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
