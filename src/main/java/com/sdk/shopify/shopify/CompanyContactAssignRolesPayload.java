// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `companyContactAssignRoles` mutation.
*/
public class CompanyContactAssignRolesPayload extends AbstractResponse<CompanyContactAssignRolesPayload> {
    public CompanyContactAssignRolesPayload() {
    }

    public CompanyContactAssignRolesPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "roleAssignments": {
                    List<CompanyContactRoleAssignment> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CompanyContactRoleAssignment> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new CompanyContactRoleAssignment(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<BusinessCustomerUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new BusinessCustomerUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public String getGraphQlTypeName() {
        return "CompanyContactAssignRolesPayload";
    }

    /**
    * A list of newly created assignments of company contacts to a company location.
    */

    public List<CompanyContactRoleAssignment> getRoleAssignments() {
        return (List<CompanyContactRoleAssignment>) get("roleAssignments");
    }

    public CompanyContactAssignRolesPayload setRoleAssignments(List<CompanyContactRoleAssignment> arg) {
        optimisticData.put(getKey("roleAssignments"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<BusinessCustomerUserError> getUserErrors() {
        return (List<BusinessCustomerUserError>) get("userErrors");
    }

    public CompanyContactAssignRolesPayload setUserErrors(List<BusinessCustomerUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "roleAssignments": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

