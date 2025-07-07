// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* <div class="note"><h4>Theme app extensions</h4>
* <p>If your app integrates with a Shopify theme and you plan to submit it to the Shopify App Store,
* you must use theme app extensions instead of Script tags. Script tags can only be used with vintage
* themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
* more</a>.</p></div>
* <div class="note"><h4>Script tag deprecation</h4>
* <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
* href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
* Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
* will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
* A script tag represents remote JavaScript code that is loaded into the pages of a shop's storefront
* or the **Order status** page of checkout.
*/
public class ScriptTag extends AbstractResponse<ScriptTag> implements LegacyInteroperability, Node {
    public ScriptTag() {
    }

    public ScriptTag(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cache": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "displayScope": {
                    responseData.put(key, ScriptTagDisplayScope.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "src": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "updatedAt": {
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

    public ScriptTag(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ScriptTag";
    }

    /**
    * Whether the Shopify CDN can cache and serve the script tag.
    * If `true`, then the script will be cached and served by the CDN.
    * The cache expires 15 minutes after the script tag is successfully returned.
    * If `false`, then the script will be served as is.
    */

    public Boolean getCache() {
        return (Boolean) get("cache");
    }

    public ScriptTag setCache(Boolean arg) {
        optimisticData.put(getKey("cache"), arg);
        return this;
    }

    /**
    * The date and time when the script tag was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ScriptTag setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The page or pages on the online store that the script should be included.
    */

    public ScriptTagDisplayScope getDisplayScope() {
        return (ScriptTagDisplayScope) get("displayScope");
    }

    public ScriptTag setDisplayScope(ScriptTagDisplayScope arg) {
        optimisticData.put(getKey("displayScope"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public ScriptTag setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The URL to the remote script.
    */

    public String getSrc() {
        return (String) get("src");
    }

    public ScriptTag setSrc(String arg) {
        optimisticData.put(getKey("src"), arg);
        return this;
    }

    /**
    * The date and time when the script tag was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public ScriptTag setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cache": return false;

            case "createdAt": return false;

            case "displayScope": return false;

            case "id": return false;

            case "legacyResourceId": return false;

            case "src": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

