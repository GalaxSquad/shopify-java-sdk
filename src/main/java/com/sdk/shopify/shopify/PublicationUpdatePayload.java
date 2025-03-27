// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `publicationUpdate` mutation.
*/
public class PublicationUpdatePayload extends AbstractResponse<PublicationUpdatePayload> {
    public PublicationUpdatePayload() {
    }

    public PublicationUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "publication": {
                    Publication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Publication(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<PublicationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PublicationUserError(jsonAsObject(element1, key)));
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
        return "PublicationUpdatePayload";
    }

    /**
    * The publication that's been updated.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public PublicationUpdatePayload setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PublicationUserError> getUserErrors() {
        return (List<PublicationUserError>) get("userErrors");
    }

    public PublicationUpdatePayload setUserErrors(List<PublicationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "publication": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

