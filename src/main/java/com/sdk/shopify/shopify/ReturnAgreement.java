// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An agreement between the merchant and customer for a return.
*/
public class ReturnAgreement extends AbstractResponse<ReturnAgreement> implements SalesAgreement {
    public ReturnAgreement() {
    }

    public ReturnAgreement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "happenedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reason": {
                    responseData.put(key, OrderActionType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "return": {
                    responseData.put(key, new Return(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "sales": {
                    responseData.put(key, new SaleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "user": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
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
        return "ReturnAgreement";
    }

    /**
    * The application that created the agreement.
    */

    public App getApp() {
        return (App) get("app");
    }

    public ReturnAgreement setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The date and time at which the agreement occured.
    */

    public String getHappenedAt() {
        return (String) get("happenedAt");
    }

    public ReturnAgreement setHappenedAt(String arg) {
        optimisticData.put(getKey("happenedAt"), arg);
        return this;
    }

    /**
    * The unique ID for the agreement.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public ReturnAgreement setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The reason the agremeent was created.
    */

    public OrderActionType getReason() {
        return (OrderActionType) get("reason");
    }

    public ReturnAgreement setReason(OrderActionType arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    /**
    * The return associated with the agreement.
    */

    public Return getReturn() {
        return (Return) get("return");
    }

    public ReturnAgreement setReturn(Return arg) {
        optimisticData.put(getKey("return"), arg);
        return this;
    }

    /**
    * The sales associated with the agreement.
    */

    public SaleConnection getSales() {
        return (SaleConnection) get("sales");
    }

    public ReturnAgreement setSales(SaleConnection arg) {
        optimisticData.put(getKey("sales"), arg);
        return this;
    }

    /**
    * The staff member associated with the agreement.
    */

    public StaffMember getUser() {
        return (StaffMember) get("user");
    }

    public ReturnAgreement setUser(StaffMember arg) {
        optimisticData.put(getKey("user"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "happenedAt": return false;

            case "id": return false;

            case "reason": return false;

            case "return": return true;

            case "sales": return true;

            case "user": return true;

            default: return false;
        }
    }
}

