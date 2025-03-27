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
* Return type for `companyContactsDelete` mutation.
*/
public class CompanyContactsDeletePayload extends AbstractResponse<CompanyContactsDeletePayload> {
    public CompanyContactsDeletePayload() {
    }

    public CompanyContactsDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedCompanyContactIds": {
                    List<ID> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ID> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ID(jsonAsString(element1, key)));
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
        return "CompanyContactsDeletePayload";
    }

    /**
    * The list of IDs of the deleted company contacts.
    */

    public List<ID> getDeletedCompanyContactIds() {
        return (List<ID>) get("deletedCompanyContactIds");
    }

    public CompanyContactsDeletePayload setDeletedCompanyContactIds(List<ID> arg) {
        optimisticData.put(getKey("deletedCompanyContactIds"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<BusinessCustomerUserError> getUserErrors() {
        return (List<BusinessCustomerUserError>) get("userErrors");
    }

    public CompanyContactsDeletePayload setUserErrors(List<BusinessCustomerUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedCompanyContactIds": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

