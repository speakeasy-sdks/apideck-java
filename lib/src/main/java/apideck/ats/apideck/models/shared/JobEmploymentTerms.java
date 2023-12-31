/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JobEmploymentTerms {
    FULL_TIME("full-time"),
    PART_TIME("part-time"),
    INTERNSHIP("internship"),
    CONTRACTOR("contractor"),
    EMPLOYEE("employee"),
    FREELANCE("freelance"),
    TEMP("temp"),
    SEASONAL("seasonal"),
    VOLUNTEER("volunteer"),
    OTHER("other");

    @JsonValue
    public final String value;

    private JobEmploymentTerms(String value) {
        this.value = value;
    }
}
