// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A Cart Transform Function to create [Customized
* Bundles.](https://shopify.dev/docs/apps/selling-strategies/bundles/add-a-customized-bundle).
*/
public class CartTransform extends AbstractResponse<CartTransform> implements HasMetafields, Node {
    public CartTransform() {
    }

    public CartTransform(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "blockOnFailure": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "functionId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

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

    public CartTransform(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CartTransform";
    }

    /**
    * Whether a run failure will block cart and checkout operations.
    */

    public Boolean getBlockOnFailure() {
        return (Boolean) get("blockOnFailure");
    }

    public CartTransform setBlockOnFailure(Boolean arg) {
        optimisticData.put(getKey("blockOnFailure"), arg);
        return this;
    }

    /**
    * The ID for the Cart Transform function.
    */

    public String getFunctionId() {
        return (String) get("functionId");
    }

    public CartTransform setFunctionId(String arg) {
        optimisticData.put(getKey("functionId"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public CartTransform setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public CartTransform setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "blockOnFailure": return false;

            case "functionId": return false;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            default: return false;
        }
    }
}

