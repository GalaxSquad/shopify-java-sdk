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

import java.util.Map;

/**
* A checkout server side validation installed on the shop.
*/
public class Validation extends AbstractResponse<Validation> implements HasMetafieldDefinitions, HasMetafields, Node {
    public Validation() {
    }

    public Validation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "blockOnFailure": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "enabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "errorHistory": {
                    FunctionsErrorHistory optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FunctionsErrorHistory(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "shopifyFunction": {
                    responseData.put(key, new ShopifyFunction(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "title": {
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

    public Validation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Validation";
    }

    /**
    * Whether the validation should block on failures other than expected violations.
    */

    public Boolean getBlockOnFailure() {
        return (Boolean) get("blockOnFailure");
    }

    public Validation setBlockOnFailure(Boolean arg) {
        optimisticData.put(getKey("blockOnFailure"), arg);
        return this;
    }

    /**
    * Whether the validation is enabled on the merchant checkout.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public Validation setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    /**
    * The error history on the most recent version of the validation function.
    */

    public FunctionsErrorHistory getErrorHistory() {
        return (FunctionsErrorHistory) get("errorHistory");
    }

    public Validation setErrorHistory(FunctionsErrorHistory arg) {
        optimisticData.put(getKey("errorHistory"), arg);
        return this;
    }

    /**
    * Global ID for the validation.
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

    public Validation setMetafield(Metafield arg) {
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

    public Validation setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The Shopify Function implementing the validation.
    */

    public ShopifyFunction getShopifyFunction() {
        return (ShopifyFunction) get("shopifyFunction");
    }

    public Validation setShopifyFunction(ShopifyFunction arg) {
        optimisticData.put(getKey("shopifyFunction"), arg);
        return this;
    }

    /**
    * The merchant-facing validation name.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Validation setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "blockOnFailure": return false;

            case "enabled": return false;

            case "errorHistory": return true;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "shopifyFunction": return true;

            case "title": return false;

            default: return false;
        }
    }
}

