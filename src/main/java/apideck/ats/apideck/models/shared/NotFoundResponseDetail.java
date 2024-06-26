/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import apideck.ats.apideck.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import apideck.ats.apideck.utils.TypedObject;
import apideck.ats.apideck.utils.Utils.JsonShape;

/**
 * NotFoundResponseDetail - Contains parameter or domain specific information related to the error and why it occurred.
 */

@JsonDeserialize(using = NotFoundResponseDetail._Deserializer.class)
public class NotFoundResponseDetail {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private NotFoundResponseDetail(TypedObject value) {
        this.value = value;
    }

    public static NotFoundResponseDetail of(String value) {
        Utils.checkNotNull(value, "value");
        return new NotFoundResponseDetail(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static NotFoundResponseDetail of(NotFoundResponse2 value) {
        Utils.checkNotNull(value, "value");
        return new NotFoundResponseDetail(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<NotFoundResponse2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code String}</li>
     * <li>{@code NotFoundResponse2}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotFoundResponseDetail other = (NotFoundResponseDetail) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends apideck.ats.apideck.utils.OneOfDeserializer<NotFoundResponseDetail> {

        public _Deserializer() {
            super(NotFoundResponseDetail.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<NotFoundResponse2>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(NotFoundResponseDetail.class,
                "value", value);
    }
 
}
