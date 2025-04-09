// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a set of UTM parameters.
*/
public class UTMParameters extends AbstractResponse<UTMParameters> {
    public UTMParameters() {
    }

    public UTMParameters(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "campaign": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "content": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "medium": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "source": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "term": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "UTMParameters";
    }

    /**
    * The name of a marketing campaign.
    */

    public String getCampaign() {
        return (String) get("campaign");
    }

    public UTMParameters setCampaign(String arg) {
        optimisticData.put(getKey("campaign"), arg);
        return this;
    }

    /**
    * Identifies specific content in a marketing campaign. Used to differentiate between similar content
    * or links in a marketing campaign to determine which is the most effective.
    */

    public String getContent() {
        return (String) get("content");
    }

    public UTMParameters setContent(String arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
    * The medium of a marketing campaign, such as a banner or email newsletter.
    */

    public String getMedium() {
        return (String) get("medium");
    }

    public UTMParameters setMedium(String arg) {
        optimisticData.put(getKey("medium"), arg);
        return this;
    }

    /**
    * The source of traffic to the merchant's store, such as Google or an email newsletter.
    */

    public String getSource() {
        return (String) get("source");
    }

    public UTMParameters setSource(String arg) {
        optimisticData.put(getKey("source"), arg);
        return this;
    }

    /**
    * Paid search terms used by a marketing campaign.
    */

    public String getTerm() {
        return (String) get("term");
    }

    public UTMParameters setTerm(String arg) {
        optimisticData.put(getKey("term"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "campaign": return false;

            case "content": return false;

            case "medium": return false;

            case "source": return false;

            case "term": return false;

            default: return false;
        }
    }
}

