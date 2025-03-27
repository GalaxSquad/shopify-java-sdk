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
* A participant defines carrier-calculated rates for shipping services
* with a possible merchant-defined fixed fee or a percentage-of-rate fee.
*/
public class DeliveryParticipant extends AbstractResponse<DeliveryParticipant> implements DeliveryRateProvider, Node {
    public DeliveryParticipant() {
    }

    public DeliveryParticipant(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adaptToNewServicesFlag": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "carrierService": {
                    responseData.put(key, new DeliveryCarrierService(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fixedFee": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "participantServices": {
                    List<DeliveryParticipantService> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryParticipantService(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "percentageOfRateFee": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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

    public DeliveryParticipant(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryParticipant";
    }

    /**
    * Whether to display new shipping services automatically to the customer when the service becomes
    * available.
    */

    public Boolean getAdaptToNewServicesFlag() {
        return (Boolean) get("adaptToNewServicesFlag");
    }

    public DeliveryParticipant setAdaptToNewServicesFlag(Boolean arg) {
        optimisticData.put(getKey("adaptToNewServicesFlag"), arg);
        return this;
    }

    /**
    * The carrier used for this participant.
    */

    public DeliveryCarrierService getCarrierService() {
        return (DeliveryCarrierService) get("carrierService");
    }

    public DeliveryParticipant setCarrierService(DeliveryCarrierService arg) {
        optimisticData.put(getKey("carrierService"), arg);
        return this;
    }

    /**
    * The merchant-defined fixed fee for this participant.
    */

    public MoneyV2 getFixedFee() {
        return (MoneyV2) get("fixedFee");
    }

    public DeliveryParticipant setFixedFee(MoneyV2 arg) {
        optimisticData.put(getKey("fixedFee"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The carrier-specific services offered by the participant, and whether each service is active.
    */

    public List<DeliveryParticipantService> getParticipantServices() {
        return (List<DeliveryParticipantService>) get("participantServices");
    }

    public DeliveryParticipant setParticipantServices(List<DeliveryParticipantService> arg) {
        optimisticData.put(getKey("participantServices"), arg);
        return this;
    }

    /**
    * The merchant-defined percentage-of-rate fee for this participant.
    */

    public Double getPercentageOfRateFee() {
        return (Double) get("percentageOfRateFee");
    }

    public DeliveryParticipant setPercentageOfRateFee(Double arg) {
        optimisticData.put(getKey("percentageOfRateFee"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adaptToNewServicesFlag": return false;

            case "carrierService": return true;

            case "fixedFee": return true;

            case "id": return false;

            case "participantServices": return true;

            case "percentageOfRateFee": return false;

            default: return false;
        }
    }
}

