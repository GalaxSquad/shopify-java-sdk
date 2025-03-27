// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the payment terms template object.
*/
public class PaymentTermsTemplate extends AbstractResponse<PaymentTermsTemplate> implements Node {
    public PaymentTermsTemplate() {
    }

    public PaymentTermsTemplate(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "description": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "dueInDays": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "paymentTermsType": {
                    responseData.put(key, PaymentTermsType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "translatedName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public PaymentTermsTemplate(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PaymentTermsTemplate";
    }

    /**
    * The description of the payment terms template.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public PaymentTermsTemplate setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The number of days between the issued date and due date if this is the net type of payment terms.
    */

    public Integer getDueInDays() {
        return (Integer) get("dueInDays");
    }

    public PaymentTermsTemplate setDueInDays(Integer arg) {
        optimisticData.put(getKey("dueInDays"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the payment terms template.
    */

    public String getName() {
        return (String) get("name");
    }

    public PaymentTermsTemplate setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The type of the payment terms template.
    */

    public PaymentTermsType getPaymentTermsType() {
        return (PaymentTermsType) get("paymentTermsType");
    }

    public PaymentTermsTemplate setPaymentTermsType(PaymentTermsType arg) {
        optimisticData.put(getKey("paymentTermsType"), arg);
        return this;
    }

    /**
    * The translated payment terms template name.
    */

    public String getTranslatedName() {
        return (String) get("translatedName");
    }

    public PaymentTermsTemplate setTranslatedName(String arg) {
        optimisticData.put(getKey("translatedName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description": return false;

            case "dueInDays": return false;

            case "id": return false;

            case "name": return false;

            case "paymentTermsType": return false;

            case "translatedName": return false;

            default: return false;
        }
    }
}

