// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A representation of store's staff member who is assigned to a [company
* location](https://shopify.dev/api/admin-graphql/latest/objects/CompanyLocation) of the shop. The
* staff member's actions will be limited to objects associated with the assigned company location.
*/
public class CompanyLocationStaffMemberAssignment extends AbstractResponse<CompanyLocationStaffMemberAssignment> implements Node {
    public CompanyLocationStaffMemberAssignment() {
    }

    public CompanyLocationStaffMemberAssignment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "companyLocation": {
                    responseData.put(key, new CompanyLocation(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "staffMember": {
                    responseData.put(key, new StaffMember(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public CompanyLocationStaffMemberAssignment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CompanyLocationStaffMemberAssignment";
    }

    /**
    * The company location the staff member is assigned to.
    */

    public CompanyLocation getCompanyLocation() {
        return (CompanyLocation) get("companyLocation");
    }

    public CompanyLocationStaffMemberAssignment setCompanyLocation(CompanyLocation arg) {
        optimisticData.put(getKey("companyLocation"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Represents the data of a staff member who's assigned to a company location.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public CompanyLocationStaffMemberAssignment setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "companyLocation": return true;

            case "id": return false;

            case "staffMember": return true;

            default: return false;
        }
    }
}

