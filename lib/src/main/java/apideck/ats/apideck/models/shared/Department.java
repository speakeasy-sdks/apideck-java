/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import apideck.ats.apideck.utils.DateTimeDeserializer;
import apideck.ats.apideck.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;


public class Department {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;

    public Department withCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * The date and time when the object was created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public Department withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The user who created the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public String createdBy;

    public Department withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public Department withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public Department withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Department name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public Department withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Parent ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    public String parentId;

    public Department withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    
    /**
     * The date and time when the object was last updated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public Department withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * The user who last updated the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_by")
    public String updatedBy;

    public Department withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    
    public Department(){}
}
