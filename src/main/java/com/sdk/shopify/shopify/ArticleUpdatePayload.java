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
* Return type for `articleUpdate` mutation.
*/
public class ArticleUpdatePayload extends AbstractResponse<ArticleUpdatePayload> {
    public ArticleUpdatePayload() {
    }

    public ArticleUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "article": {
                    Article optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Article(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ArticleUpdateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ArticleUpdateUserError(jsonAsObject(element1, key)));
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
        return "ArticleUpdatePayload";
    }

    /**
    * The article that was updated.
    */

    public Article getArticle() {
        return (Article) get("article");
    }

    public ArticleUpdatePayload setArticle(Article arg) {
        optimisticData.put(getKey("article"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ArticleUpdateUserError> getUserErrors() {
        return (List<ArticleUpdateUserError>) get("userErrors");
    }

    public ArticleUpdatePayload setUserErrors(List<ArticleUpdateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "article": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

