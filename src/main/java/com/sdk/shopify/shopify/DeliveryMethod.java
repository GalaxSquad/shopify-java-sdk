// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The delivery method used by a fulfillment order.
*/
public class DeliveryMethod extends AbstractResponse<DeliveryMethod> implements Node {
    public DeliveryMethod() {
    }

    public DeliveryMethod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "additionalInformation": {
                    DeliveryMethodAdditionalInformation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryMethodAdditionalInformation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "brandedPromise": {
                    DeliveryBrandedPromise optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryBrandedPromise(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "maxDeliveryDateTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "methodType": {
                    responseData.put(key, DeliveryMethodType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "minDeliveryDateTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "presentedName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "serviceCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sourceReference": {
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

    public DeliveryMethod(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryMethod";
    }

    /**
    * The Additional information to consider when performing the delivery.
    */

    public DeliveryMethodAdditionalInformation getAdditionalInformation() {
        return (DeliveryMethodAdditionalInformation) get("additionalInformation");
    }

    public DeliveryMethod setAdditionalInformation(DeliveryMethodAdditionalInformation arg) {
        optimisticData.put(getKey("additionalInformation"), arg);
        return this;
    }

    /**
    * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
    */

    public DeliveryBrandedPromise getBrandedPromise() {
        return (DeliveryBrandedPromise) get("brandedPromise");
    }

    public DeliveryMethod setBrandedPromise(DeliveryBrandedPromise arg) {
        optimisticData.put(getKey("brandedPromise"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's
    * location.
    */

    public String getMaxDeliveryDateTime() {
        return (String) get("maxDeliveryDateTime");
    }

    public DeliveryMethod setMaxDeliveryDateTime(String arg) {
        optimisticData.put(getKey("maxDeliveryDateTime"), arg);
        return this;
    }

    /**
    * The type of the delivery method.
    */

    public DeliveryMethodType getMethodType() {
        return (DeliveryMethodType) get("methodType");
    }

    public DeliveryMethod setMethodType(DeliveryMethodType arg) {
        optimisticData.put(getKey("methodType"), arg);
        return this;
    }

    /**
    * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's
    * location.
    */

    public String getMinDeliveryDateTime() {
        return (String) get("minDeliveryDateTime");
    }

    public DeliveryMethod setMinDeliveryDateTime(String arg) {
        optimisticData.put(getKey("minDeliveryDateTime"), arg);
        return this;
    }

    /**
    * The name of the delivery option that was presented to the buyer during checkout.
    */

    public String getPresentedName() {
        return (String) get("presentedName");
    }

    public DeliveryMethod setPresentedName(String arg) {
        optimisticData.put(getKey("presentedName"), arg);
        return this;
    }

    /**
    * A reference to the shipping method.
    */

    public String getServiceCode() {
        return (String) get("serviceCode");
    }

    public DeliveryMethod setServiceCode(String arg) {
        optimisticData.put(getKey("serviceCode"), arg);
        return this;
    }

    /**
    * Source reference is promise provider specific data associated with delivery promise.
    */

    public String getSourceReference() {
        return (String) get("sourceReference");
    }

    public DeliveryMethod setSourceReference(String arg) {
        optimisticData.put(getKey("sourceReference"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "additionalInformation": return true;

            case "brandedPromise": return true;

            case "id": return false;

            case "maxDeliveryDateTime": return false;

            case "methodType": return false;

            case "minDeliveryDateTime": return false;

            case "presentedName": return false;

            case "serviceCode": return false;

            case "sourceReference": return false;

            default: return false;
        }
    }
}

