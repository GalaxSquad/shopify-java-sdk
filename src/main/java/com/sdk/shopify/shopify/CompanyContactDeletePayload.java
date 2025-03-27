// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `companyContactDelete` mutation.
*/
public class CompanyContactDeletePayload extends AbstractResponse<CompanyContactDeletePayload> {
    public CompanyContactDeletePayload() {
    }

    public CompanyContactDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedCompanyContactId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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
        return "CompanyContactDeletePayload";
    }

    /**
    * The ID of the deleted company contact.
    */

    public ID getDeletedCompanyContactId() {
        return (ID) get("deletedCompanyContactId");
    }

    public CompanyContactDeletePayload setDeletedCompanyContactId(ID arg) {
        optimisticData.put(getKey("deletedCompanyContactId"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<BusinessCustomerUserError> getUserErrors() {
        return (List<BusinessCustomerUserError>) get("userErrors");
    }

    public CompanyContactDeletePayload setUserErrors(List<BusinessCustomerUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedCompanyContactId": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

