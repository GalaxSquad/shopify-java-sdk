// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A browse, cart, or checkout that was abandoned by a customer.
*/
public class Abandonment extends AbstractResponse<Abandonment> implements Node {
    public Abandonment() {
    }

    public Abandonment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "abandonedCheckoutPayload": {
                    AbandonedCheckout optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AbandonedCheckout(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "abandonmentType": {
                    responseData.put(key, AbandonmentAbandonmentType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cartUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customer": {
                    responseData.put(key, new Customer(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerHasNoDraftOrderSinceAbandonment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "customerHasNoOrderSinceAbandonment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "daysSinceLastAbandonmentEmail": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "emailSentAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "emailState": {
                    AbandonmentEmailState optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = AbandonmentEmailState.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hoursSinceLastAbandonedCheckout": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inventoryAvailable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isFromCustomStorefront": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isFromOnlineStore": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isFromShopApp": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isFromShopPay": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isMostSignificantAbandonment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "lastBrowseAbandonmentDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lastCartAbandonmentDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lastCheckoutAbandonmentDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "mostRecentStep": {
                    responseData.put(key, AbandonmentAbandonmentType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "productsAddedToCart": {
                    responseData.put(key, new CustomerVisitProductInfoConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productsViewed": {
                    responseData.put(key, new CustomerVisitProductInfoConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "visitStartedAt": {
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

    public Abandonment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Abandonment";
    }

    /**
    * The abandonment payload for the abandoned checkout.
    */

    public AbandonedCheckout getAbandonedCheckoutPayload() {
        return (AbandonedCheckout) get("abandonedCheckoutPayload");
    }

    public Abandonment setAbandonedCheckoutPayload(AbandonedCheckout arg) {
        optimisticData.put(getKey("abandonedCheckoutPayload"), arg);
        return this;
    }

    /**
    * The abandonment type.
    */

    public AbandonmentAbandonmentType getAbandonmentType() {
        return (AbandonmentAbandonmentType) get("abandonmentType");
    }

    public Abandonment setAbandonmentType(AbandonmentAbandonmentType arg) {
        optimisticData.put(getKey("abandonmentType"), arg);
        return this;
    }

    /**
    * The app associated with an abandoned checkout.
    */

    public App getApp() {
        return (App) get("app");
    }

    public Abandonment setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * Permalink to the cart page.
    */

    public String getCartUrl() {
        return (String) get("cartUrl");
    }

    public Abandonment setCartUrl(String arg) {
        optimisticData.put(getKey("cartUrl"), arg);
        return this;
    }

    /**
    * The date and time when the abandonment was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Abandonment setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The customer who abandoned this event.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public Abandonment setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * Whether the customer has a draft order since this abandonment has been abandoned.
    */

    public Boolean getCustomerHasNoDraftOrderSinceAbandonment() {
        return (Boolean) get("customerHasNoDraftOrderSinceAbandonment");
    }

    public Abandonment setCustomerHasNoDraftOrderSinceAbandonment(Boolean arg) {
        optimisticData.put(getKey("customerHasNoDraftOrderSinceAbandonment"), arg);
        return this;
    }

    /**
    * Whether the customer has completed an order since this checkout has been abandoned.
    */

    public Boolean getCustomerHasNoOrderSinceAbandonment() {
        return (Boolean) get("customerHasNoOrderSinceAbandonment");
    }

    public Abandonment setCustomerHasNoOrderSinceAbandonment(Boolean arg) {
        optimisticData.put(getKey("customerHasNoOrderSinceAbandonment"), arg);
        return this;
    }

    /**
    * The number of days since the last abandonment email was sent to the customer.
    */

    public Integer getDaysSinceLastAbandonmentEmail() {
        return (Integer) get("daysSinceLastAbandonmentEmail");
    }

    public Abandonment setDaysSinceLastAbandonmentEmail(Integer arg) {
        optimisticData.put(getKey("daysSinceLastAbandonmentEmail"), arg);
        return this;
    }

    /**
    * When the email was sent, if that's the case.
    */

    public String getEmailSentAt() {
        return (String) get("emailSentAt");
    }

    public Abandonment setEmailSentAt(String arg) {
        optimisticData.put(getKey("emailSentAt"), arg);
        return this;
    }

    /**
    * The email state (e.g., sent or not sent).
    */

    public AbandonmentEmailState getEmailState() {
        return (AbandonmentEmailState) get("emailState");
    }

    public Abandonment setEmailState(AbandonmentEmailState arg) {
        optimisticData.put(getKey("emailState"), arg);
        return this;
    }

    /**
    * The number of hours since the customer has last abandoned a checkout.
    */

    public Double getHoursSinceLastAbandonedCheckout() {
        return (Double) get("hoursSinceLastAbandonedCheckout");
    }

    public Abandonment setHoursSinceLastAbandonedCheckout(Double arg) {
        optimisticData.put(getKey("hoursSinceLastAbandonedCheckout"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the products in abandonment are available.
    */

    public Boolean getInventoryAvailable() {
        return (Boolean) get("inventoryAvailable");
    }

    public Abandonment setInventoryAvailable(Boolean arg) {
        optimisticData.put(getKey("inventoryAvailable"), arg);
        return this;
    }

    /**
    * Whether the abandonment event comes from a custom storefront channel.
    */

    public Boolean getIsFromCustomStorefront() {
        return (Boolean) get("isFromCustomStorefront");
    }

    public Abandonment setIsFromCustomStorefront(Boolean arg) {
        optimisticData.put(getKey("isFromCustomStorefront"), arg);
        return this;
    }

    /**
    * Whether the abandonment event comes from the Online Store sales channel.
    */

    public Boolean getIsFromOnlineStore() {
        return (Boolean) get("isFromOnlineStore");
    }

    public Abandonment setIsFromOnlineStore(Boolean arg) {
        optimisticData.put(getKey("isFromOnlineStore"), arg);
        return this;
    }

    /**
    * Whether the abandonment event comes from the Shop app sales channel.
    */

    public Boolean getIsFromShopApp() {
        return (Boolean) get("isFromShopApp");
    }

    public Abandonment setIsFromShopApp(Boolean arg) {
        optimisticData.put(getKey("isFromShopApp"), arg);
        return this;
    }

    /**
    * Whether the abandonment event comes from Shop Pay.
    */

    public Boolean getIsFromShopPay() {
        return (Boolean) get("isFromShopPay");
    }

    public Abandonment setIsFromShopPay(Boolean arg) {
        optimisticData.put(getKey("isFromShopPay"), arg);
        return this;
    }

    /**
    * Whether the customer didn't complete another most significant step since this abandonment.
    */

    public Boolean getIsMostSignificantAbandonment() {
        return (Boolean) get("isMostSignificantAbandonment");
    }

    public Abandonment setIsMostSignificantAbandonment(Boolean arg) {
        optimisticData.put(getKey("isMostSignificantAbandonment"), arg);
        return this;
    }

    /**
    * The date for the latest browse abandonment.
    */

    public String getLastBrowseAbandonmentDate() {
        return (String) get("lastBrowseAbandonmentDate");
    }

    public Abandonment setLastBrowseAbandonmentDate(String arg) {
        optimisticData.put(getKey("lastBrowseAbandonmentDate"), arg);
        return this;
    }

    /**
    * The date for the latest cart abandonment.
    */

    public String getLastCartAbandonmentDate() {
        return (String) get("lastCartAbandonmentDate");
    }

    public Abandonment setLastCartAbandonmentDate(String arg) {
        optimisticData.put(getKey("lastCartAbandonmentDate"), arg);
        return this;
    }

    /**
    * The date for the latest checkout abandonment.
    */

    public String getLastCheckoutAbandonmentDate() {
        return (String) get("lastCheckoutAbandonmentDate");
    }

    public Abandonment setLastCheckoutAbandonmentDate(String arg) {
        optimisticData.put(getKey("lastCheckoutAbandonmentDate"), arg);
        return this;
    }

    /**
    * The most recent step type.
    */

    public AbandonmentAbandonmentType getMostRecentStep() {
        return (AbandonmentAbandonmentType) get("mostRecentStep");
    }

    public Abandonment setMostRecentStep(AbandonmentAbandonmentType arg) {
        optimisticData.put(getKey("mostRecentStep"), arg);
        return this;
    }

    /**
    * The products added to the cart during the customer abandoned visit.
    */

    public CustomerVisitProductInfoConnection getProductsAddedToCart() {
        return (CustomerVisitProductInfoConnection) get("productsAddedToCart");
    }

    public Abandonment setProductsAddedToCart(CustomerVisitProductInfoConnection arg) {
        optimisticData.put(getKey("productsAddedToCart"), arg);
        return this;
    }

    /**
    * The products viewed during the customer abandoned visit.
    */

    public CustomerVisitProductInfoConnection getProductsViewed() {
        return (CustomerVisitProductInfoConnection) get("productsViewed");
    }

    public Abandonment setProductsViewed(CustomerVisitProductInfoConnection arg) {
        optimisticData.put(getKey("productsViewed"), arg);
        return this;
    }

    /**
    * The date and time when the visit started.
    */

    public String getVisitStartedAt() {
        return (String) get("visitStartedAt");
    }

    public Abandonment setVisitStartedAt(String arg) {
        optimisticData.put(getKey("visitStartedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "abandonedCheckoutPayload": return true;

            case "abandonmentType": return false;

            case "app": return true;

            case "cartUrl": return false;

            case "createdAt": return false;

            case "customer": return true;

            case "customerHasNoDraftOrderSinceAbandonment": return false;

            case "customerHasNoOrderSinceAbandonment": return false;

            case "daysSinceLastAbandonmentEmail": return false;

            case "emailSentAt": return false;

            case "emailState": return false;

            case "hoursSinceLastAbandonedCheckout": return false;

            case "id": return false;

            case "inventoryAvailable": return false;

            case "isFromCustomStorefront": return false;

            case "isFromOnlineStore": return false;

            case "isFromShopApp": return false;

            case "isFromShopPay": return false;

            case "isMostSignificantAbandonment": return false;

            case "lastBrowseAbandonmentDate": return false;

            case "lastCartAbandonmentDate": return false;

            case "lastCheckoutAbandonmentDate": return false;

            case "mostRecentStep": return false;

            case "productsAddedToCart": return true;

            case "productsViewed": return true;

            case "visitStartedAt": return false;

            default: return false;
        }
    }
}

