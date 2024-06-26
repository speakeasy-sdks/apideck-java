/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import apideck.ats.apideck.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ApplicationInput {

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("applicant_id")
    private Optional<? extends String> applicantId;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("job_id")
    private Optional<? extends String> jobId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stage")
    private Optional<? extends Stage> stage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends Status> status;

    public ApplicationInput(
            @JsonProperty("applicant_id") Optional<? extends String> applicantId,
            @JsonProperty("job_id") Optional<? extends String> jobId,
            @JsonProperty("stage") Optional<? extends Stage> stage,
            @JsonProperty("status") JsonNullable<? extends Status> status) {
        Utils.checkNotNull(applicantId, "applicantId");
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(stage, "stage");
        Utils.checkNotNull(status, "status");
        this.applicantId = applicantId;
        this.jobId = jobId;
        this.stage = stage;
        this.status = status;
    }

    public Optional<? extends String> applicantId() {
        return applicantId;
    }

    public Optional<? extends String> jobId() {
        return jobId;
    }

    public Optional<? extends Stage> stage() {
        return stage;
    }

    public JsonNullable<? extends Status> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApplicationInput withApplicantId(String applicantId) {
        Utils.checkNotNull(applicantId, "applicantId");
        this.applicantId = Optional.ofNullable(applicantId);
        return this;
    }

    public ApplicationInput withApplicantId(Optional<? extends String> applicantId) {
        Utils.checkNotNull(applicantId, "applicantId");
        this.applicantId = applicantId;
        return this;
    }

    public ApplicationInput withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = Optional.ofNullable(jobId);
        return this;
    }

    public ApplicationInput withJobId(Optional<? extends String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    public ApplicationInput withStage(Stage stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = Optional.ofNullable(stage);
        return this;
    }

    public ApplicationInput withStage(Optional<? extends Stage> stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = stage;
        return this;
    }

    public ApplicationInput withStatus(Status status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    public ApplicationInput withStatus(JsonNullable<? extends Status> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationInput other = (ApplicationInput) o;
        return 
            java.util.Objects.deepEquals(this.applicantId, other.applicantId) &&
            java.util.Objects.deepEquals(this.jobId, other.jobId) &&
            java.util.Objects.deepEquals(this.stage, other.stage) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            applicantId,
            jobId,
            stage,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplicationInput.class,
                "applicantId", applicantId,
                "jobId", jobId,
                "stage", stage,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> applicantId = Optional.empty();
 
        private Optional<? extends String> jobId = Optional.empty();
 
        private Optional<? extends Stage> stage = Optional.empty();
 
        private JsonNullable<? extends Status> status = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder applicantId(String applicantId) {
            Utils.checkNotNull(applicantId, "applicantId");
            this.applicantId = Optional.ofNullable(applicantId);
            return this;
        }

        public Builder applicantId(Optional<? extends String> applicantId) {
            Utils.checkNotNull(applicantId, "applicantId");
            this.applicantId = applicantId;
            return this;
        }

        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = Optional.ofNullable(jobId);
            return this;
        }

        public Builder jobId(Optional<? extends String> jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }

        public Builder stage(Stage stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = Optional.ofNullable(stage);
            return this;
        }

        public Builder stage(Optional<? extends Stage> stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = stage;
            return this;
        }

        public Builder status(Status status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        public Builder status(JsonNullable<? extends Status> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public ApplicationInput build() {
            return new ApplicationInput(
                applicantId,
                jobId,
                stage,
                status);
        }
    }
}

