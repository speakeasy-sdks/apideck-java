/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import apideck.ats.apideck.utils.SpeakeasyMetadata;
import apideck.ats.apideck.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ApplicantsFilter {

    /**
     * Id of the job to filter on
     */
    @SpeakeasyMetadata("queryParam:name=job_id")
    private Optional<? extends String> jobId;

    public ApplicantsFilter(
            Optional<? extends String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
    }

    /**
     * Id of the job to filter on
     */
    public Optional<? extends String> jobId() {
        return jobId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Id of the job to filter on
     */
    public ApplicantsFilter withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = Optional.ofNullable(jobId);
        return this;
    }

    /**
     * Id of the job to filter on
     */
    public ApplicantsFilter withJobId(Optional<? extends String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
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
        ApplicantsFilter other = (ApplicantsFilter) o;
        return 
            java.util.Objects.deepEquals(this.jobId, other.jobId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            jobId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplicantsFilter.class,
                "jobId", jobId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> jobId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Id of the job to filter on
         */
        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = Optional.ofNullable(jobId);
            return this;
        }

        /**
         * Id of the job to filter on
         */
        public Builder jobId(Optional<? extends String> jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }
        
        public ApplicantsFilter build() {
            return new ApplicantsFilter(
                jobId);
        }
    }
}

