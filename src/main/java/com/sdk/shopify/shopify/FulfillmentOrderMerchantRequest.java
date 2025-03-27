// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A request made by the merchant or an order management app to a fulfillment service
* for a fulfillment order.
*/
public class FulfillmentOrderMerchantRequest extends AbstractResponse<FulfillmentOrderMerchantRequest> implements Node {
    public FulfillmentOrderMerchantRequest() {
    }

    public FulfillmentOrderMerchantRequest(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentOrder": {
                    responseData.put(key, new FulfillmentOrder(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "kind": {
                    responseData.put(key, FulfillmentOrderMerchantRequestKind.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "message": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requestOptions": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "responseData": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sentAt": {
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

    public FulfillmentOrderMerchantRequest(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentOrderMerchantRequest";
    }

    /**
    * The fulfillment order associated with the merchant request.
    */

    public FulfillmentOrder getFulfillmentOrder() {
        return (FulfillmentOrder) get("fulfillmentOrder");
    }

    public FulfillmentOrderMerchantRequest setFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("fulfillmentOrder"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The kind of request made.
    */

    public FulfillmentOrderMerchantRequestKind getKind() {
        return (FulfillmentOrderMerchantRequestKind) get("kind");
    }

    public FulfillmentOrderMerchantRequest setKind(FulfillmentOrderMerchantRequestKind arg) {
        optimisticData.put(getKey("kind"), arg);
        return this;
    }

    /**
    * The optional message that the merchant included in the request.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public FulfillmentOrderMerchantRequest setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
    * Additional options requested by the merchant. These depend on the `kind` of the request.
    * For example, for a `FULFILLMENT_REQUEST`, one option is `notify_customer`, which indicates whether
    * the
    * merchant intends to notify the customer upon fulfillment. The fulfillment service can then set
    * `notifyCustomer` when making calls to `FulfillmentCreate`.
    */

    public String getRequestOptions() {
        return (String) get("requestOptions");
    }

    public FulfillmentOrderMerchantRequest setRequestOptions(String arg) {
        optimisticData.put(getKey("requestOptions"), arg);
        return this;
    }

    /**
    * The response from the fulfillment service.
    */

    public String getResponseData() {
        return (String) get("responseData");
    }

    public FulfillmentOrderMerchantRequest setResponseData(String arg) {
        optimisticData.put(getKey("responseData"), arg);
        return this;
    }

    /**
    * The timestamp when the request was made.
    */

    public String getSentAt() {
        return (String) get("sentAt");
    }

    public FulfillmentOrderMerchantRequest setSentAt(String arg) {
        optimisticData.put(getKey("sentAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentOrder": return true;

            case "id": return false;

            case "kind": return false;

            case "message": return false;

            case "requestOptions": return false;

            case "responseData": return false;

            case "sentAt": return false;

            default: return false;
        }
    }
}

