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

/**
 * Links - Links to navigate to previous or next pages through the API
 */

public class Links {

    /**
     * Link to navigate to the current page through the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("current")
    private Optional<? extends String> current;

    /**
     * Link to navigate to the previous page through the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private JsonNullable<? extends String> next;

    /**
     * Link to navigate to the previous page through the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private JsonNullable<? extends String> previous;

    public Links(
            @JsonProperty("current") Optional<? extends String> current,
            @JsonProperty("next") JsonNullable<? extends String> next,
            @JsonProperty("previous") JsonNullable<? extends String> previous) {
        Utils.checkNotNull(current, "current");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(previous, "previous");
        this.current = current;
        this.next = next;
        this.previous = previous;
    }

    /**
     * Link to navigate to the current page through the API
     */
    public Optional<? extends String> current() {
        return current;
    }

    /**
     * Link to navigate to the previous page through the API
     */
    public JsonNullable<? extends String> next() {
        return next;
    }

    /**
     * Link to navigate to the previous page through the API
     */
    public JsonNullable<? extends String> previous() {
        return previous;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Link to navigate to the current page through the API
     */
    public Links withCurrent(String current) {
        Utils.checkNotNull(current, "current");
        this.current = Optional.ofNullable(current);
        return this;
    }

    /**
     * Link to navigate to the current page through the API
     */
    public Links withCurrent(Optional<? extends String> current) {
        Utils.checkNotNull(current, "current");
        this.current = current;
        return this;
    }

    /**
     * Link to navigate to the previous page through the API
     */
    public Links withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = JsonNullable.of(next);
        return this;
    }

    /**
     * Link to navigate to the previous page through the API
     */
    public Links withNext(JsonNullable<? extends String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    /**
     * Link to navigate to the previous page through the API
     */
    public Links withPrevious(String previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = JsonNullable.of(previous);
        return this;
    }

    /**
     * Link to navigate to the previous page through the API
     */
    public Links withPrevious(JsonNullable<? extends String> previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = previous;
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
        Links other = (Links) o;
        return 
            java.util.Objects.deepEquals(this.current, other.current) &&
            java.util.Objects.deepEquals(this.next, other.next) &&
            java.util.Objects.deepEquals(this.previous, other.previous);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            current,
            next,
            previous);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Links.class,
                "current", current,
                "next", next,
                "previous", previous);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> current = Optional.empty();
 
        private JsonNullable<? extends String> next = JsonNullable.undefined();
 
        private JsonNullable<? extends String> previous = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Link to navigate to the current page through the API
         */
        public Builder current(String current) {
            Utils.checkNotNull(current, "current");
            this.current = Optional.ofNullable(current);
            return this;
        }

        /**
         * Link to navigate to the current page through the API
         */
        public Builder current(Optional<? extends String> current) {
            Utils.checkNotNull(current, "current");
            this.current = current;
            return this;
        }

        /**
         * Link to navigate to the previous page through the API
         */
        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = JsonNullable.of(next);
            return this;
        }

        /**
         * Link to navigate to the previous page through the API
         */
        public Builder next(JsonNullable<? extends String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        /**
         * Link to navigate to the previous page through the API
         */
        public Builder previous(String previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = JsonNullable.of(previous);
            return this;
        }

        /**
         * Link to navigate to the previous page through the API
         */
        public Builder previous(JsonNullable<? extends String> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }
        
        public Links build() {
            return new Links(
                current,
                next,
                previous);
        }
    }
}

