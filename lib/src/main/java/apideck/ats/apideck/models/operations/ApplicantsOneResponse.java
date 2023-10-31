/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ApplicantsOneResponse {
    /**
     * Bad Request
     */
    
    public apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse;

    public ApplicantsOneResponse withBadRequestResponse(apideck.ats.apideck.models.shared.BadRequestResponse badRequestResponse) {
        this.badRequestResponse = badRequestResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ApplicantsOneResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Applicants
     */
    
    public apideck.ats.apideck.models.shared.GetApplicantResponse getApplicantResponse;

    public ApplicantsOneResponse withGetApplicantResponse(apideck.ats.apideck.models.shared.GetApplicantResponse getApplicantResponse) {
        this.getApplicantResponse = getApplicantResponse;
        return this;
    }
    
    /**
     * The specified resource was not found
     */
    
    public apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse;

    public ApplicantsOneResponse withNotFoundResponse(apideck.ats.apideck.models.shared.NotFoundResponse notFoundResponse) {
        this.notFoundResponse = notFoundResponse;
        return this;
    }
    
    /**
     * Payment Required
     */
    
    public apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse;

    public ApplicantsOneResponse withPaymentRequiredResponse(apideck.ats.apideck.models.shared.PaymentRequiredResponse paymentRequiredResponse) {
        this.paymentRequiredResponse = paymentRequiredResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ApplicantsOneResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ApplicantsOneResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Unauthorized
     */
    
    public apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse;

    public ApplicantsOneResponse withUnauthorizedResponse(apideck.ats.apideck.models.shared.UnauthorizedResponse unauthorizedResponse) {
        this.unauthorizedResponse = unauthorizedResponse;
        return this;
    }
    
    /**
     * Unexpected error
     */
    
    public apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse;

    public ApplicantsOneResponse withUnexpectedErrorResponse(apideck.ats.apideck.models.shared.UnexpectedErrorResponse unexpectedErrorResponse) {
        this.unexpectedErrorResponse = unexpectedErrorResponse;
        return this;
    }
    
    /**
     * Unprocessable
     */
    
    public apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse;

    public ApplicantsOneResponse withUnprocessableResponse(apideck.ats.apideck.models.shared.UnprocessableResponse unprocessableResponse) {
        this.unprocessableResponse = unprocessableResponse;
        return this;
    }
    
    public ApplicantsOneResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
