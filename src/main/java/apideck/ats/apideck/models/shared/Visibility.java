/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import apideck.ats.apideck.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Visibility - The visibility of the job
 */
public enum Visibility {
    DRAFT("draft"),
    PUBLIC_("public"),
    INTERNAL("internal");

    @JsonValue
    private final String value;

    private Visibility(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
