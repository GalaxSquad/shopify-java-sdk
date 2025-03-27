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
* Return type for `metafieldsSet` mutation.
*/
public class MetafieldsSetPayload extends AbstractResponse<MetafieldsSetPayload> {
    public MetafieldsSetPayload() {
    }

    public MetafieldsSetPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "metafields": {
                    List<Metafield> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Metafield> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Metafield(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MetafieldsSetUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldsSetUserError(jsonAsObject(element1, key)));
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
        return "MetafieldsSetPayload";
    }

    /**
    * The list of metafields that were set.
    */

    public List<Metafield> getMetafields() {
        return (List<Metafield>) get("metafields");
    }

    public MetafieldsSetPayload setMetafields(List<Metafield> arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MetafieldsSetUserError> getUserErrors() {
        return (List<MetafieldsSetUserError>) get("userErrors");
    }

    public MetafieldsSetPayload setUserErrors(List<MetafieldsSetUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "metafields": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

