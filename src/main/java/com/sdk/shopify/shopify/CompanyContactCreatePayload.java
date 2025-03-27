// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `companyContactCreate` mutation.
*/
public class CompanyContactCreatePayload extends AbstractResponse<CompanyContactCreatePayload> {
    public CompanyContactCreatePayload() {
    }

    public CompanyContactCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "companyContact": {
                    CompanyContact optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContact(jsonAsObject(field.getValue(), key));
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
        return "CompanyContactCreatePayload";
    }

    /**
    * The created company contact.
    */

    public CompanyContact getCompanyContact() {
        return (CompanyContact) get("companyContact");
    }

    public CompanyContactCreatePayload setCompanyContact(CompanyContact arg) {
        optimisticData.put(getKey("companyContact"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<BusinessCustomerUserError> getUserErrors() {
        return (List<BusinessCustomerUserError>) get("userErrors");
    }

    public CompanyContactCreatePayload setUserErrors(List<BusinessCustomerUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "companyContact": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

