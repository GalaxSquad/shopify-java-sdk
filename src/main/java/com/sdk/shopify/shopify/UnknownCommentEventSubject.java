// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The subject line of a comment event.
*/
public class UnknownCommentEventSubject extends AbstractResponse<UnknownCommentEventSubject> implements CommentEventSubject {
    public UnknownCommentEventSubject() {
    }

    public UnknownCommentEventSubject(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "hasTimelineComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public static CommentEventSubject create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Company": {
                return new Company(fields);
            }

            case "CompanyLocation": {
                return new CompanyLocation(fields);
            }

            case "Customer": {
                return new Customer(fields);
            }

            case "DraftOrder": {
                return new DraftOrder(fields);
            }

            case "Order": {
                return new Order(fields);
            }

            case "PriceRule": {
                return new PriceRule(fields);
            }

            default: {
                return new UnknownCommentEventSubject(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * Whether the timeline subject has a timeline comment. If true, then a timeline comment exists.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public UnknownCommentEventSubject setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownCommentEventSubject setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "hasTimelineComment": return false;

            case "id": return false;

            default: return false;
        }
    }
}

