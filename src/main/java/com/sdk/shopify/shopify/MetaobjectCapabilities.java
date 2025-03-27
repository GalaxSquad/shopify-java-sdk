// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Provides the capabilities of a metaobject definition.
*/
public class MetaobjectCapabilities extends AbstractResponse<MetaobjectCapabilities> {
    public MetaobjectCapabilities() {
    }

    public MetaobjectCapabilities(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "onlineStore": {
                    MetaobjectCapabilitiesOnlineStore optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectCapabilitiesOnlineStore(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishable": {
                    responseData.put(key, new MetaobjectCapabilitiesPublishable(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "renderable": {
                    MetaobjectCapabilitiesRenderable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectCapabilitiesRenderable(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "translatable": {
                    responseData.put(key, new MetaobjectCapabilitiesTranslatable(jsonAsObject(field.getValue(), key)));

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
        return "MetaobjectCapabilities";
    }

    /**
    * Indicates whether a metaobject definition can be displayed as a page on the Online Store.
    */

    public MetaobjectCapabilitiesOnlineStore getOnlineStore() {
        return (MetaobjectCapabilitiesOnlineStore) get("onlineStore");
    }

    public MetaobjectCapabilities setOnlineStore(MetaobjectCapabilitiesOnlineStore arg) {
        optimisticData.put(getKey("onlineStore"), arg);
        return this;
    }

    /**
    * Indicate whether a metaobject definition is publishable.
    */

    public MetaobjectCapabilitiesPublishable getPublishable() {
        return (MetaobjectCapabilitiesPublishable) get("publishable");
    }

    public MetaobjectCapabilities setPublishable(MetaobjectCapabilitiesPublishable arg) {
        optimisticData.put(getKey("publishable"), arg);
        return this;
    }

    /**
    * Indicate whether a metaobject definition is renderable and exposes SEO data.
    */

    public MetaobjectCapabilitiesRenderable getRenderable() {
        return (MetaobjectCapabilitiesRenderable) get("renderable");
    }

    public MetaobjectCapabilities setRenderable(MetaobjectCapabilitiesRenderable arg) {
        optimisticData.put(getKey("renderable"), arg);
        return this;
    }

    /**
    * Indicate whether a metaobject definition is translatable.
    */

    public MetaobjectCapabilitiesTranslatable getTranslatable() {
        return (MetaobjectCapabilitiesTranslatable) get("translatable");
    }

    public MetaobjectCapabilities setTranslatable(MetaobjectCapabilitiesTranslatable arg) {
        optimisticData.put(getKey("translatable"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "onlineStore": return true;

            case "publishable": return true;

            case "renderable": return true;

            case "translatable": return true;

            default: return false;
        }
    }
}

