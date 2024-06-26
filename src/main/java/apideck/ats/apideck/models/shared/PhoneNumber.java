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
import org.openapitools.jackson.nullable.JsonNullable;


public class PhoneNumber {

    /**
     * The area code of the phone number, e.g. 323
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("area_code")
    private JsonNullable<? extends String> areaCode;

    /**
     * The country code of the phone number, e.g. +1
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_code")
    private JsonNullable<? extends String> countryCode;

    /**
     * The extension of the phone number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extension")
    private JsonNullable<? extends String> extension;

    /**
     * Unique identifier of the phone number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<? extends String> id;

    /**
     * The phone number
     */
    @JsonProperty("number")
    private String number;

    /**
     * The type of phone number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends PhoneNumberType> type;

    public PhoneNumber(
            @JsonProperty("area_code") JsonNullable<? extends String> areaCode,
            @JsonProperty("country_code") JsonNullable<? extends String> countryCode,
            @JsonProperty("extension") JsonNullable<? extends String> extension,
            @JsonProperty("id") JsonNullable<? extends String> id,
            @JsonProperty("number") String number,
            @JsonProperty("type") JsonNullable<? extends PhoneNumberType> type) {
        Utils.checkNotNull(areaCode, "areaCode");
        Utils.checkNotNull(countryCode, "countryCode");
        Utils.checkNotNull(extension, "extension");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(number, "number");
        Utils.checkNotNull(type, "type");
        this.areaCode = areaCode;
        this.countryCode = countryCode;
        this.extension = extension;
        this.id = id;
        this.number = number;
        this.type = type;
    }

    /**
     * The area code of the phone number, e.g. 323
     */
    public JsonNullable<? extends String> areaCode() {
        return areaCode;
    }

    /**
     * The country code of the phone number, e.g. +1
     */
    public JsonNullable<? extends String> countryCode() {
        return countryCode;
    }

    /**
     * The extension of the phone number
     */
    public JsonNullable<? extends String> extension() {
        return extension;
    }

    /**
     * Unique identifier of the phone number
     */
    public JsonNullable<? extends String> id() {
        return id;
    }

    /**
     * The phone number
     */
    public String number() {
        return number;
    }

    /**
     * The type of phone number
     */
    public JsonNullable<? extends PhoneNumberType> type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The area code of the phone number, e.g. 323
     */
    public PhoneNumber withAreaCode(String areaCode) {
        Utils.checkNotNull(areaCode, "areaCode");
        this.areaCode = JsonNullable.of(areaCode);
        return this;
    }

    /**
     * The area code of the phone number, e.g. 323
     */
    public PhoneNumber withAreaCode(JsonNullable<? extends String> areaCode) {
        Utils.checkNotNull(areaCode, "areaCode");
        this.areaCode = areaCode;
        return this;
    }

    /**
     * The country code of the phone number, e.g. +1
     */
    public PhoneNumber withCountryCode(String countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = JsonNullable.of(countryCode);
        return this;
    }

    /**
     * The country code of the phone number, e.g. +1
     */
    public PhoneNumber withCountryCode(JsonNullable<? extends String> countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The extension of the phone number
     */
    public PhoneNumber withExtension(String extension) {
        Utils.checkNotNull(extension, "extension");
        this.extension = JsonNullable.of(extension);
        return this;
    }

    /**
     * The extension of the phone number
     */
    public PhoneNumber withExtension(JsonNullable<? extends String> extension) {
        Utils.checkNotNull(extension, "extension");
        this.extension = extension;
        return this;
    }

    /**
     * Unique identifier of the phone number
     */
    public PhoneNumber withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier of the phone number
     */
    public PhoneNumber withId(JsonNullable<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The phone number
     */
    public PhoneNumber withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
        return this;
    }

    /**
     * The type of phone number
     */
    public PhoneNumber withType(PhoneNumberType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of phone number
     */
    public PhoneNumber withType(JsonNullable<? extends PhoneNumberType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        PhoneNumber other = (PhoneNumber) o;
        return 
            java.util.Objects.deepEquals(this.areaCode, other.areaCode) &&
            java.util.Objects.deepEquals(this.countryCode, other.countryCode) &&
            java.util.Objects.deepEquals(this.extension, other.extension) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.number, other.number) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            areaCode,
            countryCode,
            extension,
            id,
            number,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PhoneNumber.class,
                "areaCode", areaCode,
                "countryCode", countryCode,
                "extension", extension,
                "id", id,
                "number", number,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> areaCode = JsonNullable.undefined();
 
        private JsonNullable<? extends String> countryCode = JsonNullable.undefined();
 
        private JsonNullable<? extends String> extension = JsonNullable.undefined();
 
        private JsonNullable<? extends String> id = JsonNullable.undefined();
 
        private String number;
 
        private JsonNullable<? extends PhoneNumberType> type = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The area code of the phone number, e.g. 323
         */
        public Builder areaCode(String areaCode) {
            Utils.checkNotNull(areaCode, "areaCode");
            this.areaCode = JsonNullable.of(areaCode);
            return this;
        }

        /**
         * The area code of the phone number, e.g. 323
         */
        public Builder areaCode(JsonNullable<? extends String> areaCode) {
            Utils.checkNotNull(areaCode, "areaCode");
            this.areaCode = areaCode;
            return this;
        }

        /**
         * The country code of the phone number, e.g. +1
         */
        public Builder countryCode(String countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = JsonNullable.of(countryCode);
            return this;
        }

        /**
         * The country code of the phone number, e.g. +1
         */
        public Builder countryCode(JsonNullable<? extends String> countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = countryCode;
            return this;
        }

        /**
         * The extension of the phone number
         */
        public Builder extension(String extension) {
            Utils.checkNotNull(extension, "extension");
            this.extension = JsonNullable.of(extension);
            return this;
        }

        /**
         * The extension of the phone number
         */
        public Builder extension(JsonNullable<? extends String> extension) {
            Utils.checkNotNull(extension, "extension");
            this.extension = extension;
            return this;
        }

        /**
         * Unique identifier of the phone number
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier of the phone number
         */
        public Builder id(JsonNullable<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The phone number
         */
        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }

        /**
         * The type of phone number
         */
        public Builder type(PhoneNumberType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of phone number
         */
        public Builder type(JsonNullable<? extends PhoneNumberType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public PhoneNumber build() {
            return new PhoneNumber(
                areaCode,
                countryCode,
                extension,
                id,
                number,
                type);
        }
    }
}

