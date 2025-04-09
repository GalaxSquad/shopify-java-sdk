// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Defines a relation between two resources via a reference metafield.
* The referencer owns the joining field with a given namespace and key,
* while the target is referenced by the field.
*/
public class MetafieldRelation extends AbstractResponse<MetafieldRelation> {
    public MetafieldRelation() {
    }

    public MetafieldRelation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "namespace": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "referencer": {
                    responseData.put(key, UnknownMetafieldReferencer.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "target": {
                    responseData.put(key, UnknownMetafieldReference.create(jsonAsObject(field.getValue(), key)));

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
        return "MetafieldRelation";
    }

    /**
    * The key of the field making the reference.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MetafieldRelation setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The name of the field making the reference.
    */

    public String getName() {
        return (String) get("name");
    }

    public MetafieldRelation setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The namespace of the metafield making the reference, or type of the metaobject.
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public MetafieldRelation setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    /**
    * The resource making the reference.
    */

    public MetafieldReferencer getReferencer() {
        return (MetafieldReferencer) get("referencer");
    }

    public MetafieldRelation setReferencer(MetafieldReferencer arg) {
        optimisticData.put(getKey("referencer"), arg);
        return this;
    }

    /**
    * The referenced resource.
    */

    public MetafieldReference getTarget() {
        return (MetafieldReference) get("target");
    }

    public MetafieldRelation setTarget(MetafieldReference arg) {
        optimisticData.put(getKey("target"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "name": return false;

            case "namespace": return false;

            case "referencer": return false;

            case "target": return false;

            default: return false;
        }
    }
}

