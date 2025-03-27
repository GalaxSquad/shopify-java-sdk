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
* The charge descriptors for a Japanese payments account.
*/
public class ShopifyPaymentsJpChargeStatementDescriptor extends AbstractResponse<ShopifyPaymentsJpChargeStatementDescriptor> implements ShopifyPaymentsChargeStatementDescriptor {
    public ShopifyPaymentsJpChargeStatementDescriptor() {
    }

    public ShopifyPaymentsJpChargeStatementDescriptor(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "default": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "kana": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "kanji": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prefix": {
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

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsJpChargeStatementDescriptor";
    }

    /**
    * The default charge statement descriptor.
    */

    public String getDefault() {
        return (String) get("default");
    }

    public ShopifyPaymentsJpChargeStatementDescriptor setDefault(String arg) {
        optimisticData.put(getKey("default"), arg);
        return this;
    }

    /**
    * The charge statement descriptor in kana.
    */

    public String getKana() {
        return (String) get("kana");
    }

    public ShopifyPaymentsJpChargeStatementDescriptor setKana(String arg) {
        optimisticData.put(getKey("kana"), arg);
        return this;
    }

    /**
    * The charge statement descriptor in kanji.
    */

    public String getKanji() {
        return (String) get("kanji");
    }

    public ShopifyPaymentsJpChargeStatementDescriptor setKanji(String arg) {
        optimisticData.put(getKey("kanji"), arg);
        return this;
    }

    /**
    * The prefix of the statement descriptor.
    */

    public String getPrefix() {
        return (String) get("prefix");
    }

    public ShopifyPaymentsJpChargeStatementDescriptor setPrefix(String arg) {
        optimisticData.put(getKey("prefix"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "default": return false;

            case "kana": return false;

            case "kanji": return false;

            case "prefix": return false;

            default: return false;
        }
    }
}

