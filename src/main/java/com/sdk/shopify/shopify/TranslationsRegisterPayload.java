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
* Return type for `translationsRegister` mutation.
*/
public class TranslationsRegisterPayload extends AbstractResponse<TranslationsRegisterPayload> {
    public TranslationsRegisterPayload() {
    }

    public TranslationsRegisterPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "translations": {
                    List<Translation> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Translation> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Translation(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<TranslationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TranslationUserError(jsonAsObject(element1, key)));
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
        return "TranslationsRegisterPayload";
    }

    /**
    * The translations that were created or updated.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public TranslationsRegisterPayload setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<TranslationUserError> getUserErrors() {
        return (List<TranslationUserError>) get("userErrors");
    }

    public TranslationsRegisterPayload setUserErrors(List<TranslationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "translations": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

