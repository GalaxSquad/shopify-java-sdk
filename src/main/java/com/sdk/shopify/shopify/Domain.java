// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A unique string that represents the address of a Shopify store on the Internet.
*/
public class Domain extends AbstractResponse<Domain> implements Node {
    public Domain() {
    }

    public Domain(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "host": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "localization": {
                    DomainLocalization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DomainLocalization(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketWebPresence": {
                    MarketWebPresence optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketWebPresence(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sslEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public Domain(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Domain";
    }

    /**
    * The host name of the domain. For example, `example.com`.
    */

    public String getHost() {
        return (String) get("host");
    }

    public Domain setHost(String arg) {
        optimisticData.put(getKey("host"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The localization of the domain, if the domain doesn't redirect.
    */

    public DomainLocalization getLocalization() {
        return (DomainLocalization) get("localization");
    }

    public Domain setLocalization(DomainLocalization arg) {
        optimisticData.put(getKey("localization"), arg);
        return this;
    }

    /**
    * The web presence of the domain.
    */

    public MarketWebPresence getMarketWebPresence() {
        return (MarketWebPresence) get("marketWebPresence");
    }

    public Domain setMarketWebPresence(MarketWebPresence arg) {
        optimisticData.put(getKey("marketWebPresence"), arg);
        return this;
    }

    /**
    * Whether SSL is enabled.
    */

    public Boolean getSslEnabled() {
        return (Boolean) get("sslEnabled");
    }

    public Domain setSslEnabled(Boolean arg) {
        optimisticData.put(getKey("sslEnabled"), arg);
        return this;
    }

    /**
    * The URL of the domain (for example, `https://example.com`).
    */

    public String getUrl() {
        return (String) get("url");
    }

    public Domain setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "host": return false;

            case "id": return false;

            case "localization": return true;

            case "marketWebPresence": return true;

            case "sslEnabled": return false;

            case "url": return false;

            default: return false;
        }
    }
}

