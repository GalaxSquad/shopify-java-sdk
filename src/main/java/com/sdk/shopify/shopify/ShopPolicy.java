// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Policy that a merchant has configured for their store, such as their refund or privacy policy.
*/
public class ShopPolicy extends AbstractResponse<ShopPolicy> implements HasPublishedTranslations, Node {
    public ShopPolicy() {
    }

    public ShopPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "body": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "type": {
                    responseData.put(key, ShopPolicyType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "url": {
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

    public ShopPolicy(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopPolicy";
    }

    /**
    * The text of the policy. The maximum size is 512kb.
    */

    public String getBody() {
        return (String) get("body");
    }

    public ShopPolicy setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was
    * created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ShopPolicy setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The translated title of the policy. For example, Refund Policy or Politique de remboursement.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ShopPolicy setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public ShopPolicy setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The shop policy type.
    */

    public ShopPolicyType getType() {
        return (ShopPolicyType) get("type");
    }

    public ShopPolicy setType(ShopPolicyType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the policy was
    * last modified.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public ShopPolicy setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The public URL of the policy.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public ShopPolicy setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "body": return false;

            case "createdAt": return false;

            case "id": return false;

            case "title": return false;

            case "translations": return true;

            case "type": return false;

            case "updatedAt": return false;

            case "url": return false;

            default: return false;
        }
    }
}

