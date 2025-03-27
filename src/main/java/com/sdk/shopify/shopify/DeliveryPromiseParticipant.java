// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Returns enabled delivery promise participants.
*/
public class DeliveryPromiseParticipant extends AbstractResponse<DeliveryPromiseParticipant> implements Node {
    public DeliveryPromiseParticipant() {
    }

    public DeliveryPromiseParticipant(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "owner": {
                    DeliveryPromiseParticipantOwner optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownDeliveryPromiseParticipantOwner.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ownerType": {
                    responseData.put(key, DeliveryPromiseParticipantOwnerType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public DeliveryPromiseParticipant(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryPromiseParticipant";
    }

    /**
    * The ID of the promise participant.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The resource that the participant is attached to.
    */

    public DeliveryPromiseParticipantOwner getOwner() {
        return (DeliveryPromiseParticipantOwner) get("owner");
    }

    public DeliveryPromiseParticipant setOwner(DeliveryPromiseParticipantOwner arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    /**
    * The owner type of the participant.
    */

    public DeliveryPromiseParticipantOwnerType getOwnerType() {
        return (DeliveryPromiseParticipantOwnerType) get("ownerType");
    }

    public DeliveryPromiseParticipant setOwnerType(DeliveryPromiseParticipantOwnerType arg) {
        optimisticData.put(getKey("ownerType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "owner": return false;

            case "ownerType": return false;

            default: return false;
        }
    }
}

