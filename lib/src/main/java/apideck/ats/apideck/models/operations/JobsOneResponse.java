/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class JobsOneResponse {
    /**
     * Bad Request
     */
    
    public apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse;

    public JobsOneResponse withBadRequestResponse(apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse) {
        this.badRequestResponse = badRequestResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public JobsOneResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Jobs
     */
    
    public apideck.ats.apideck.models.shared.GetJobResponse getJobResponse;

    public JobsOneResponse withGetJobResponse(apideck.ats.apideck.models.shared.GetJobResponse getJobResponse) {
        this.getJobResponse = getJobResponse;
        return this;
    }
    
    /**
     * The specified resource was not found
     */
    
    public apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse;

    public JobsOneResponse withNotFoundResponse(apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse) {
        this.notFoundResponse = notFoundResponse;
        return this;
    }
    
    /**
     * Payment Required
     */
    
    public apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse;

    public JobsOneResponse withPaymentRequiredResponse(apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse) {
        this.paymentRequiredResponse = paymentRequiredResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public JobsOneResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public JobsOneResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Unauthorized
     */
    
    public apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse;

    public JobsOneResponse withUnauthorizedResponse(apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse) {
        this.unauthorizedResponse = unauthorizedResponse;
        return this;
    }
    
    /**
     * Unexpected error
     */
    
    public apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse;

    public JobsOneResponse withUnexpectedErrorResponse(apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse) {
        this.unexpectedErrorResponse = unexpectedErrorResponse;
        return this;
    }
    
    /**
     * Unprocessable
     */
    
    public apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse;

    public JobsOneResponse withUnprocessableResponse(apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse) {
        this.unprocessableResponse = unprocessableResponse;
        return this;
    }
    
    public JobsOneResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
