/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ApplicantsDeleteResponse {
    /**
     * Bad Request
     */
    
    public apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse;

    public ApplicantsDeleteResponse withBadRequestResponse(apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse) {
        this.badRequestResponse = badRequestResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ApplicantsDeleteResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Applicants
     */
    
    public apideck.ats.apideck.models.shared.DeleteApplicantResponse deleteApplicantResponse;

    public ApplicantsDeleteResponse withDeleteApplicantResponse(apideck.ats.apideck.models.shared.DeleteApplicantResponse deleteApplicantResponse) {
        this.deleteApplicantResponse = deleteApplicantResponse;
        return this;
    }
    
    /**
     * The specified resource was not found
     */
    
    public apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse;

    public ApplicantsDeleteResponse withNotFoundResponse(apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse) {
        this.notFoundResponse = notFoundResponse;
        return this;
    }
    
    /**
     * Payment Required
     */
    
    public apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse;

    public ApplicantsDeleteResponse withPaymentRequiredResponse(apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse) {
        this.paymentRequiredResponse = paymentRequiredResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ApplicantsDeleteResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ApplicantsDeleteResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Unauthorized
     */
    
    public apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse;

    public ApplicantsDeleteResponse withUnauthorizedResponse(apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse) {
        this.unauthorizedResponse = unauthorizedResponse;
        return this;
    }
    
    /**
     * Unexpected error
     */
    
    public apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse;

    public ApplicantsDeleteResponse withUnexpectedErrorResponse(apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse) {
        this.unexpectedErrorResponse = unexpectedErrorResponse;
        return this;
    }
    
    /**
     * Unprocessable
     */
    
    public apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse;

    public ApplicantsDeleteResponse withUnprocessableResponse(apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse) {
        this.unprocessableResponse = unprocessableResponse;
        return this;
    }
    
    public ApplicantsDeleteResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}