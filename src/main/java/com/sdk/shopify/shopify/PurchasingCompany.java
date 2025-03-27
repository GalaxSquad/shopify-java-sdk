// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents information about the purchasing company for the order or draft order.
*/
public class PurchasingCompany extends AbstractResponse<PurchasingCompany> implements PurchasingEntity {
    public PurchasingCompany() {
    }

    public PurchasingCompany(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "company": {
                    responseData.put(key, new Company(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "contact": {
                    CompanyContact optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContact(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "location": {
                    responseData.put(key, new CompanyLocation(jsonAsObject(field.getValue(), key)));

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
        return "PurchasingCompany";
    }

    /**
    * The company associated to the order or draft order.
    */

    public Company getCompany() {
        return (Company) get("company");
    }

    public PurchasingCompany setCompany(Company arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The company contact associated to the order or draft order.
    */

    public CompanyContact getContact() {
        return (CompanyContact) get("contact");
    }

    public PurchasingCompany setContact(CompanyContact arg) {
        optimisticData.put(getKey("contact"), arg);
        return this;
    }

    /**
    * The company location associated to the order or draft order.
    */

    public CompanyLocation getLocation() {
        return (CompanyLocation) get("location");
    }

    public PurchasingCompany setLocation(CompanyLocation arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "company": return true;

            case "contact": return true;

            case "location": return true;

            default: return false;
        }
    }
}

