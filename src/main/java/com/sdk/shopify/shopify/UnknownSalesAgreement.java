// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* A contract between a merchant and a customer to do business. Shopify creates a sales agreement
* whenever an order is placed, edited, or refunded. A sales agreement has one or more sales records,
* which provide itemized details about the initial agreement or subsequent changes made to the order.
* For example, when a customer places an order, Shopify creates the order, generates a sales
* agreement, and records a sale for each line item purchased in the order. A sale record is specific
* to a type of order line. Order lines can represent different things such as a purchased product, a
* tip added by a customer, shipping costs collected at checkout, and more.
*/
public class UnknownSalesAgreement extends AbstractResponse<UnknownSalesAgreement> implements SalesAgreement {
    public UnknownSalesAgreement() {
    }

    public UnknownSalesAgreement(JsonObject fields) throws SchemaViolationError {
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

    public static SalesAgreement create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "OrderAgreement": {
                return new OrderAgreement(fields);
            }

            case "OrderEditAgreement": {
                return new OrderEditAgreement(fields);
            }

            case "RefundAgreement": {
                return new RefundAgreement(fields);
            }

            case "ReturnAgreement": {
                return new ReturnAgreement(fields);
            }

            default: {
                return new UnknownSalesAgreement(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The application that created the agreement.
    */

    public App getApp() {
        return (App) get("app");
    }

    public UnknownSalesAgreement setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The date and time at which the agreement occured.
    */

    public String getHappenedAt() {
        return (String) get("happenedAt");
    }

    public UnknownSalesAgreement setHappenedAt(String arg) {
        optimisticData.put(getKey("happenedAt"), arg);
        return this;
    }

    /**
    * The unique ID for the agreement.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownSalesAgreement setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The reason the agremeent was created.
    */

    public OrderActionType getReason() {
        return (OrderActionType) get("reason");
    }

    public UnknownSalesAgreement setReason(OrderActionType arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    /**
    * The sales associated with the agreement.
    */

    public SaleConnection getSales() {
        return (SaleConnection) get("sales");
    }

    public UnknownSalesAgreement setSales(SaleConnection arg) {
        optimisticData.put(getKey("sales"), arg);
        return this;
    }

    /**
    * The staff member associated with the agreement.
    */

    public StaffMember getUser() {
        return (StaffMember) get("user");
    }

    public UnknownSalesAgreement setUser(StaffMember arg) {
        optimisticData.put(getKey("user"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "happenedAt": return false;

            case "id": return false;

            case "reason": return false;

            case "sales": return true;

            case "user": return true;

            default: return false;
        }
    }
}

