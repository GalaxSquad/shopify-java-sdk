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
* Represents the tax settings for a company location.
*/
public class CompanyLocationTaxSettings extends AbstractResponse<CompanyLocationTaxSettings> {
    public CompanyLocationTaxSettings() {
    }

    public CompanyLocationTaxSettings(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "taxExempt": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "taxExemptions": {
                    List<TaxExemption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(TaxExemption.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "taxRegistrationId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "CompanyLocationTaxSettings";
    }

    /**
    * Whether the location is exempt from taxes.
    */

    public Boolean getTaxExempt() {
        return (Boolean) get("taxExempt");
    }

    public CompanyLocationTaxSettings setTaxExempt(Boolean arg) {
        optimisticData.put(getKey("taxExempt"), arg);
        return this;
    }

    /**
    * The list of tax exemptions applied to the location.
    */

    public List<TaxExemption> getTaxExemptions() {
        return (List<TaxExemption>) get("taxExemptions");
    }

    public CompanyLocationTaxSettings setTaxExemptions(List<TaxExemption> arg) {
        optimisticData.put(getKey("taxExemptions"), arg);
        return this;
    }

    /**
    * The tax registration ID for the company location.
    */

    public String getTaxRegistrationId() {
        return (String) get("taxRegistrationId");
    }

    public CompanyLocationTaxSettings setTaxRegistrationId(String arg) {
        optimisticData.put(getKey("taxRegistrationId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "taxExempt": return false;

            case "taxExemptions": return false;

            case "taxRegistrationId": return false;

            default: return false;
        }
    }
}

